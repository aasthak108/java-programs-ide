package dynamicProgramming;

public class NumberOfUniqueBST {

    //calculate the number of BST that can be formed from given number of nodes = n;

    //used CATALAN formula
    public static int numberOfBST(int n){
        int dp [] = new int[n+1];
        dp[0] =1;
        dp[1] = 1;
        for(int i =2;i<=n;i++){
            int left = 0;
            int right = i-1;
            while( left <= i-1){
                dp[i] += dp[left] * dp[right];
                left++;
                right--;
            }
        }
    return dp[n];
    }
    public static void main(String args[])
    {
        System.out.println(""+ numberOfBST(3));
    }
}
