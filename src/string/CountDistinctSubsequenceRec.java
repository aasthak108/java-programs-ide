package string;
import java.util.HashSet;

public class CountDistinctSubsequenceRec
{
    public static int countSub(String str, int n, String s1, HashSet<String> set1)
    {
        if(n==0)
        {
            set1.add(s1);
            return 0;
        }
        int include = countSub(str,n-1,s1+str.charAt(n-1),set1);
        int exclude = countSub(str,n-1,s1,set1);
        return set1.size();
    }
    public static void main(String args[])
    {
        HashSet<String> set1 = new HashSet<>();
        String str = "gfg";
        String s1 = " ";
        System.out.println(""+ countSub(str,str.length(),s1,set1));
    }
}
