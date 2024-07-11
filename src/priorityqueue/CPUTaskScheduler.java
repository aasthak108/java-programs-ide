package priorityqueue;

import java.util.*;

public class CPUTaskScheduler {
    public static int leastInterval(char[] tasks, int n) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for(int i =0;i<tasks.length;i++){
            if(freq.containsKey(tasks[i])){
                freq.put(tasks[i],freq.get(tasks[i])+1);
            }
            else{
                freq.put(tasks[i],1);
            }
        }
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for(int frequency: freq.values()){
            q.add(frequency);
        }
        int minTime=0;
        while(!q.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int i =0;
            while(i<=n && !q.isEmpty()){
                list.add(q.poll());
                i++;
            }
            for(int count : list){
                if(--count>0){
                    q.add(count);
                }
            }
            minTime += q.isEmpty() ? i :n+1;


        }
        return minTime;

    }
    public static void main(String args[]){

        char[] tasks1 = {'A', 'A', 'A', 'B', 'B', 'B'};
        int n1 = 2;
        System.out.println(CPUTaskScheduler.leastInterval(tasks1, n1)); // Output: 8

        char[] tasks2 = {'A', 'C', 'A', 'B', 'D', 'B'};
        int n2 = 1;
        System.out.println(CPUTaskScheduler.leastInterval(tasks2, n2)); // Output: 6

        char[] tasks3 = {'A', 'A', 'A', 'B', 'B', 'B'};
        int n3 = 3;
        System.out.println(CPUTaskScheduler.leastInterval(tasks3, n3)); // Output: 10
    }
}
