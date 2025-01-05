package string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class OptimizedUniquePalindromicSubsequence
{
    public static int countSubsequence(String s)
    {
        int count =0;
        HashMap<Character, int[]> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(!map.containsKey(s.charAt(i)))
            {
                map.put(s.charAt(i),new int[]{i,i});
            }
            else
            {
                map.get(s.charAt(i))[1] =i;
            }
        }
        for(Map.Entry<Character,int[]> entry:map.entrySet())
        {
            int res[] = entry.getValue();
            if(res[0]==res[1])
            {
                continue;
            }
            HashSet<Character> hs = new HashSet<>();
            for(int i = res[0]+1;i<res[1];i++)
            {
                hs.add(s.charAt(i));
            }
            count = count + hs.size();
        }
        return count;
    }
    public static void main(String args[])
    {
        String str= "abacb";
        System.out.println(""+ countSubsequence(str));
    }
}
