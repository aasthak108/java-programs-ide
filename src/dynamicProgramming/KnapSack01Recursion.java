package dynamicProgramming;

public class KnapSack01Recursion {

    public static int knapRecur(int wt[], int val[],int W, int n){
        if(n==0|| W==0){
            return 0;
        }
        if(wt[n-1]<=W){
            return Math.max(val[n-1] + knapRecur(wt,val,W-wt[n-1],n-1),knapRecur(wt,val,W,n-1));
        }
        else if(wt[n-1]>=W){
            return knapRecur(wt,val,W,n-1);
        }
        return 0;
    }
    public static void main(String args[]){
        int wt[] = {1,3,4,5};
        int val [] ={1,4,5,7};
        int W = 7;
        int n = wt.length;
        System.out.println(""+ knapRecur(wt,val,W,n));
    }

}
