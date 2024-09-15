package arrays;

/*
Given a sorted array arr[] of distinct integers. Sort the array into a wave-like array(In Place).
In other words,
arrange the elements into a sequence such that arr[1] >= arr[2] <= arr[3] >= arr[4] <= arr[5].....
*/


public class ConvertToWaveArray {
    public static void waveArray(int arr[]){
        for(int i=1;i<arr.length;i = i+2){
            int temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] =temp;
        }
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        waveArray(arr);
        for(int i =0;i<arr.length;i++){
            System.out.println("" + arr[i]);
        }
    }

}
