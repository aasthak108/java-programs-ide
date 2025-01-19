package dynamicProgramming;

public class CoinChangeMinRec
{
        public static int coinChange(int[] coins, int amount)
        {
            int ans=  helper(coins,coins.length,amount);
            return (ans==Integer.MAX_VALUE-1) ? -1:ans;
        }
        public static int helper(int[] coins, int n, int amount)
        {
            if(amount==0)
            {
                return 0;
            }
            if(n==0 && amount !=0)
            {
                return Integer.MAX_VALUE-1;
            }
            if(coins[n-1]<=amount)
            {
                return Math.min(1+helper(coins,n,amount-coins[n-1]),helper(coins,n-1,amount));
            }
            else
            {
                return helper(coins,n-1,amount);
            }

            }
            public static void main(String args[])
            {
            int arr[] = {1,2,3};
            int sum = 8;
            System.out.println(""+ coinChange(arr,sum));
            }
}
