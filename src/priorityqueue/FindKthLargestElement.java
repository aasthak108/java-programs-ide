package priorityqueue;

// findKthLargest Element without sorting
// used minHeap-PriorityQueue

import java.util.PriorityQueue;

public class FindKthLargestElement {

    public static int kthLargest(int arr[], int k){
        PriorityQueue<Integer> q = new PriorityQueue<>();// min Heap
        for(int i =0;i<arr.length;i++){
            q.add(arr[i]);
        }
        while(q.size()>k){
            q.poll();
        }
        return q.peek();
    }
    public static void main(String args[]){

        int arr1[] = {3,2,1,5,6,4}; // output--> 5
        int k1 = 2;
        System.out.println("" + kthLargest(arr1,k1));

        int arr2[] = {3,2,3,1,2,4,5,5,6}; // output--> 4
        int k2 = 4;
        System.out.println(""+ kthLargest(arr2,k2));
    }
}
