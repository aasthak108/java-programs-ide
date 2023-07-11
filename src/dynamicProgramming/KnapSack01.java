package dynamicProgramming;

import java.util.Arrays;

public class KnapSack01 {
    static int knapSack01(int W, int[] wt, int[] val, int n) {
        int dp[][] = new int[n + 1][W + 1];
        for (int i = 0; i < n + 1; i++) {
            Arrays.fill(dp[i], -1);
        }
        return utilityKnapSack01(W, wt, val, n, dp);
    }

    static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    static int utilityKnapSack01(int W, int wt[], int val[], int n, int dp[][]) {
        if (n == 0 || W == 0) {
            return 0;
        }
        if (dp[n][W] != -1) {
            return dp[n][W];
        }
        if (wt[n - 1] <= W) {
            return dp[n][W] = max(val[n - 1] + utilityKnapSack01(W - wt[n - 1], wt, val, n - 1, dp),
                    utilityKnapSack01(W, wt, val, n - 1, dp));
        } else if (wt[n - 1] > W) {
            return dp[n][W] = utilityKnapSack01(W, wt, val, n - 1, dp);
        }
        return 0;
    }


    public static void main(String[] args){
        int wt[] = {10,20,30};
        int val[] = { 60, 100, 120 };
        int W=50;
        int n = wt.length;
        System.out.println(knapSack01(W,wt,val,n));
   }


}
