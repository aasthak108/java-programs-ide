package priorityqueue;

// find all k largest element
// example --> {7,2,5,6,1,9}, k=3
//output(all kth largest from 1 o to k
// 9 -> 1st largest, 7 -> 2nd largest, 6 -> 3rd largest

import java.util.PriorityQueue;

public class FindAllKLargestElement {
    public static void kLargest(int[] arr, int k) {

        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int i =0;i<arr.length;i++){
            q.add(arr[i]);
        }
        while(q.size()>k){
            q.poll();
        }
        int arr2[] = new int[k];
        int index = k-1;
        while(!q.isEmpty()){
            arr2[index--] = q.poll();
        }
        for(int i=0;i<arr2.length;i++){
            System.out.print(" " + arr2[i]);
        }
        System.out.println("");
    }
    public static void main(String args[]){

        int arr1[] = {12, 5, 787, 1, 23}; // output -> 787,23
        int k1 = 2;
         kLargest(arr1,k1);

        int arr2[] = {1, 23, 12, 9, 30, 2, 51}; // output -> 51,30,23
        int k2 = 3;
        kLargest(arr2,k2);
    }
}
