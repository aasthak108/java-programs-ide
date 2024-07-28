package priorityqueue;

import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

public class MinDeletionToUniqueFrequency {

    public static int minDeletions(String s) {
        char[] str = s.toCharArray();
        int n = str.length;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i =0;i<n;i++){
            if(map.containsKey(str[i])){
                map.put(str[i],map.get(str[i])+1);
            }else{
                map.put(str[i],1);
            }
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>
                (Collections.reverseOrder());
        for(int freq : map.values()) {
            maxHeap.add(freq);
        }

        int count=0;
        while(!maxHeap.isEmpty()){
            int currFreq = maxHeap.poll();
            if(maxHeap.isEmpty()){
                return count;
            }
            if(currFreq == maxHeap.peek()){
                if(currFreq >1){
                    maxHeap.add(currFreq -1);
                }
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        String  s = "aaabbbccc";
        System.out.println("" + minDeletions(s));

    }
}
