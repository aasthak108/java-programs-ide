package string;

import java.util.HashSet;

    public class UniquePalindromicSubsequenceRec
    {
        public static int countPalindromicSubsequence(String s)
        {
            HashSet<String> hs = new HashSet<>();
            helper(s,"",s.length(),hs);
            return hs.size();
        }
        public static void helper(String s, String s1, int n, HashSet<String> hs)
        {
            if (s1.length() == 3 && isPalindrome(s1))
            {
                hs.add(s1);
                return;
            }
            if(n==0){
                return;
            }
            System.out.println("Current subsequence: " + s1 + ", Current index: " + n);
            if(n>0)
            {
                helper(s, s1 + s.charAt(n - 1), n - 1, hs);
                helper(s, s1, n - 1, hs);
            }

        }
        static boolean isPalindrome(String str)
        {
            int left = 0, right = str.length() - 1;
            while (left < right) {
                if (str.charAt(left) != str.charAt(right))
                {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
        public static void main(String args[])
        {
            String s = "aabca";
            System.out.println(""+ countPalindromicSubsequence(s));
        }
    }


