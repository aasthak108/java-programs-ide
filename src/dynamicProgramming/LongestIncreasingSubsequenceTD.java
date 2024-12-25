package dynamicProgramming;

public class LongestIncreasingSubsequenceTD {
    public static int lis(int[] arr,int curr,int prev)
    {
        int n = arr.length;
        int dp[] = new int[n];
        int max=0;
        for(int i=0;i<n;i++)
        {
            dp[i] = 1;
        }
        for(int i =1;i<n;i++)
        {
            for(int j =0;j<i;j++)
            {
                if(arr[i]>arr[j])
                {
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
        }
        for(int  i =0;i<dp.length;i++)
        {
            max = Math.max(max,dp[i]);
        }
        return max;
    }
    public static void main(String args[])
    {
        int arr[] = {10,22,9,33};
        System.out.println("" + lis(arr,0,-1));
    }
}
