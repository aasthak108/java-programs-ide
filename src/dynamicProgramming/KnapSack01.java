package dynamicProgramming;

import java.util.Arrays;

class KnapSakc01{

    static int knapSack01(int wt[],int val[],int W, int n) {
        int dp[][] = new int[n + 1][W + 1];
        for (int i = 0; i < n + 1; i++) {
            Arrays.fill(dp[i], -1);
        }
        return utilityKS(dp,wt,val,W,n);
    }
        static int utilityKS(int[][] dp,int wt[],int val[],int W, int n){

        if(n==0||W==0)
        {
            return 0;
        }
        if(dp[n][W]!=-1){
            return dp[n][W];
        }
        else if(wt[n-1]<=W){
            return dp[n][W] = Math.max(val[n-1] + utilityKS(dp,wt,val,W-wt[n-1],n-1), utilityKS
                    (dp,wt,val,W,n-1));
        }
        else if(wt[n-1]>W){
            return dp[n][W] = utilityKS(dp,wt,val,W,n);
        }
        return 0;
        }
    public static void main(String[] args){
        int wt[] = {10,20,30};
        int val[] = { 60, 100, 120 };
        int W=50;
        int n = wt.length;
        System.out.println(knapSack01(wt,val,W,n));
    }

}
