package dynamicProgramming;

public class LongestCommonSubsequenceTD {

    public static int lcs(String str1, String str2, int n, int m){
        int dp[][] = new int[n+1][m+1];
        for(int i =0;i<n+1;i++){
            for(int j =0;j<m+1;j++){
                dp[i][j] =0;
            }
        }
        for(int i =1;i<n+1;i++){
            for(int j =1;j<m+1;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
                else{
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String args[])
    {
        String str1 = "ABCD";
        String str2 = "ACDR";
        System.out.println("" + lcs(str1,str2,4,4));
    }
}
