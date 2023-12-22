package hashing;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int arr[],int target){
        int arr2[] = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int sno = target - arr[i];
            if(map.containsKey(sno)){
                arr2[0] = map.get(sno);
                arr2[1] = i;
                break;
            }
            map.put(arr[i],i);
        }
        return arr2;
    }
    public static void main(String[] args){
        int arr[] = {1,4,6,3,8};
        int target = 10;
        int[] arr3 = new TwoSum().twoSum(arr,target);
        for(int i=0;i<arr3.length;i++){
            System.out.println("" + arr3[i]);
            
        }

    }
}
