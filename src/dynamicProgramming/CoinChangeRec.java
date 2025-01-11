package dynamicProgramming;

public class CoinChangeRec
{
    public static int count(int coins[], int sum)
    {
        return helper(coins, sum, coins.length);
    }

    public static int helper(int[] coins, int sum, int n)
    {
        if (sum == 0)
        {
            return 1;
        }
        if (sum < 0 || n == 0)
        {
            return 0;
        }

        // Recursive cases
        int takeCoins = helper(coins, sum - coins[n - 1], n);
        int notTakeCoins = helper(coins, sum, n - 1);

        return takeCoins + notTakeCoins;
    }

    public static void main(String[] args)
    {
        int coins[] = {1, 2, 4};
        int sum = 4;
        System.out.println(count(coins, sum)); // Output: 4
    }
}
