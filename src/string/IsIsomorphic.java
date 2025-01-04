package string;

import java.util.HashMap;

public class IsIsomorphic
{
    public static boolean isIsomorphic(String s1, String s2)
    {
    HashMap<Character, Integer> m1 = new HashMap<>();
    HashMap<Character, Integer> m2 = new HashMap<>();
         if(s1.length() != s2.length())
    {
        return false;
    }
         for(int i =0;i<s1.length();i++)
    {
        m1.putIfAbsent(s1.charAt(i), i);
        m2.putIfAbsent(s2.charAt(i), i);

        if(!m1.get(s1.charAt(i)).equals(m2.get(s2.charAt(i))))
        {
            return false;
        }
    }
        return true;
}
public static void main(String args[])
{
        String s1 = "aab";
        String s2 = "xxy";
        System.out.println(""+ isIsomorphic(s1,s2));
}
}
