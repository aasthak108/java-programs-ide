package string;

import java.util.HashMap;

public class CountDistinctSubsequenceTD
{
    public static int countSubsequence(String s)
    {
        int n = s.length();
        int mod = 1000000007; //---->if the input is very large;
        int dp[] = new int[n+1];
        dp[0] = 1;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i =1;i<n+1;i++)
        {
            dp[i] = (2 * (dp[i-1])) % mod;
            char ch = s.charAt(i-1);
            if(map.containsKey(ch))
            {
                int k = map.get(ch);
                dp[i] = (dp[i] - dp[k-1] + mod) % mod;
            }
            map.put(ch,i);
        }
        return dp[n];
    }
    public static void main(String args[])
    {
        String str = "gfg";
        System.out.println("" + countSubsequence(str));
    }
}
