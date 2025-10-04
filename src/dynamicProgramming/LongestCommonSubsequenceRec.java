package dynamicProgramming;

//Using-Recursion

    public class LongestCommonSubsequenceRec
    {
        public static int lcs(String str1, String str2, int n, int m)
        {
            if(n ==0 || m ==0)
            {
                return 0;
            }
            if(str1.charAt(n-1)==str2.charAt(m-1))
            {
                return 1+(lcs(str1, str2, n-1,m-1));
            }
            else
            {
                return Math.max(lcs(str1, str2, n, m - 1), lcs(str1, str2, n - 1, m));
            }
        }
        public static void main(String args[])
        {
            String str1 = "ABCD";
            String str2 = "ACDR";
            System.out.println("" + lcs(str1,str2,4,4));
        }
    }

