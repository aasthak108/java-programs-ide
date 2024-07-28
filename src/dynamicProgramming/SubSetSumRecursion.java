package dynamicProgramming;

public class SubSetSumRecursion {

    static boolean subsetSumRec(int n,int arr[],int sum){
        if(n==0){
            return false;
        }
        if(sum==0){
            return true;
        }
        if(arr[n-1]>sum) {
            return subsetSumRec(n - 1, arr, sum);
        }

            return subsetSumRec(n-1,arr,sum) || subsetSumRec(n-1,arr,sum-arr[n-1]);
    }
    public static void main(String args[]){
        int arr[] = {2,3,7,8,10};
        int n =arr.length;
        int sum =5;
        System.out.println(""+ subsetSumRec(n,arr,sum));
    }
}
