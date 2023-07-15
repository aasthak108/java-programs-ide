package dynamicProgramming;

public class EqualSumPartitionTD {
    static boolean canPartition(int n,int[] arr){
        int sum=0;
        for(int i=0;i<n;i++){
            sum += arr[i];
        }
        if(sum%2!=0){
            return false;
        }
        return check(n,sum/2,arr);
    }
    static boolean check(int n,int sum,int[] arr){
        boolean t[][] = new boolean[sum+1][n+1];
        boolean res = false;
        for(int i=1;i<sum+1;i++){
            t[i][0]=false;
        }
        for(int j=0;j<n+1;j++){
            t[0][j]=true;
        }
        for(int i=1;i<sum+1;i++){
            for(int j=1;j<n+1;j++){
                if(arr[j-1]<=i){
                    res = t[i-arr[j-1]][j-1] || t[i][j-1];
                }
                else {
                    res = t[i][j-1];
                }
            }
        }
        return res;
    }
    public static void main(String[] args){
        int arr[] = {1,5,5,11};
        int n =arr.length;
        System.out.println(""+ canPartition(n,arr));
    }

}
