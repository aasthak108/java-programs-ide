package dynamicProgramming;

public class JumpGameTD
{
    public static boolean canJump(int[] nums)
    {
        boolean dp[] = new boolean[nums.length];
        dp[0] = true;
        for (int i = 0; i < nums.length; i++)
        {
            if (dp[i]) {
                int count = Math.min(i + nums[i], nums.length - 1);
                for (int j = i + 1; j <= count; j++)
                {
                    dp[j] = true;
                    if (j == nums.length - 1)
                    {
                        return true;
                    }
                }
            }
        }
        return dp[nums.length - 1];
    }
    public static void main(String[] args)
    {
        int[] array= {1,1,2};
        System.out.println("" + canJump(array));
    }

}
