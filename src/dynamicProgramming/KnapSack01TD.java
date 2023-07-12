package dynamicProgramming;

public class KnapSack01TD {
    static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    static int knapSack01TopDown(int W,int wt[],int val[],int n ) {
        int t[][] = new int[n + 1][W + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < W + 1; j++) {
                t[i][j] = 0;
            }
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                if(wt[i-1]<=j){
                    t[i][j]=max(val[i-1]+t[i-1][j-wt[i-1]],t[i-1][j]);
                }
                else{
                    t[i][j]=t[i-1][j];
                }
            }
        }
        return t[n][W];
    }
    public static void main(String[] args){
        int wt[] = {10,20,30};
        int val[] = { 60, 100, 120 };
        int W=50;
        int n = wt.length;
        System.out.println(knapSack01TopDown(W,wt,val,n));
    }

}
