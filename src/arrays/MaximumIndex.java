package arrays;

//Given an array arr of positive integers.
//The task is to return the maximum of j - i subjected to the constraint of arr[i] < arr[j] and i < j.


public class MaximumIndex {

    public static int maxIndex(int arr[], int n){
        int min[] = new int[n];
        int max[] = new int[n];
        min[0] = arr[0];
        for(int i =1;i<n;i++){
            min[i] = Math.min(min[i-1],arr[i]);
        }
        max[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--){
            max[i] = Math.max(max[i+1], arr[i]);
        }
        int diff=0,i=0,j=0;
        while(i<n && j<n){
            if(min[i]<=max[j]){
                diff = Math.max(diff,j-i);
                j++;
            }
            else{
                i++;
            }

        }
        return diff;
    }
    public static void main(String args[]){
        int arr[] = {34, 8, 10, 3, 2, 80, 30, 33, 1};  // output-> 6;
        int n = arr.length;
        System.out.println(""+ maxIndex(arr,n));
    }
}
