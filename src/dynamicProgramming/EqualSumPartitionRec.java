package dynamicProgramming;

public class EqualSumPartitionRec {
    public static boolean canPartition(int[] arr,int n) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if (sum % 2 != 0) {
            return false;
        }
        return e(arr, n, sum / 2);
    }
    static boolean e(int arr[],int n,int sum){
        if (n == 0 && sum == 0) {
            return true;
        }
        if (n == 0 && sum != 0) {
            return false;
        }
        if(arr[n-1]<=sum){
            return e(arr,n-1,sum) || e(arr,n-1,sum- arr[n-1]);
        }
        else{
            return e(arr,n-1,sum);
        }

    }
    public static void main(String args[]){
        int arr[] = {1,5,5,11,3,4};
        int n = arr.length;
        System.out.println(""+ canPartition(arr,n));
    }
}
