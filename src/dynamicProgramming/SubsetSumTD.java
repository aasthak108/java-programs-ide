package dynamicProgramming;

public class SubsetSumTD {
    static Boolean subsetSumTD(int n, int arr[], int sum){
        boolean dp[][] = new boolean[n+1][sum+1];
        for(int i=0;i<n+1;i++){
            dp[i][0] = true;
        }
        for(int j=1;j<sum+1;j++){
            dp[0][j] = false;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                if(arr[i-1]<= j){
                    dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][sum];
    }
    public static void main(String args[]){
        int arr[] = {2,3,7,8,10};
        int n =arr.length;
        int sum =9;
        System.out.println(""+ subsetSumTD(n,arr,sum));

    }
}
