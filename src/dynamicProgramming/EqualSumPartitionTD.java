package dynamicProgramming;

public class EqualSumPartitionTD {
    static boolean canPartition(int n, int[] arr) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        if (sum % 2 != 0) {
            return false;
        }
        return check(n, sum / 2, arr);
    }

    static boolean check(int n, int sum, int[] arr) {
        boolean dp[][] = new boolean[n+1][sum+1];
        for(int i =0;i<n+1;i++){
            dp[i][0] = true;
        }
        for(int j=1;j<sum+1;j++){
            dp[0][j] = false;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                if(arr[i-1]<=j){
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-arr[i-1]];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }

        }
        return dp[n][sum];
}


    public static void main(String[] args){
        int arr[] = {1,5,5,11,1,3};
        int n =arr.length;
        System.out.println(""+ canPartition(n,arr));
    }

}
