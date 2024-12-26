package dynamicProgramming;

//Given two strings s1 and s2 of lengths m and n respectively and below operations that can be performed on s1.
// Find the minimum number of edits (operations) to convert s1 into s2.

public class EditDistance {
    public static int editDis(String s1, String s2, int n, int m)
    {
        if(n==0)
        {
            return m;
        }if(m==0)
        {
            return n;
        }
        int replace = editDis(s1,s2,n-1,m-1);
        int remove = editDis(s1,s2,n-1,m);
        int insert = editDis(s1,s2,n,m-1);
        if(s1.charAt(n-1)==s2.charAt(m-1))
        {
            return editDis(s1,s2,n-1,m-1);
        }
        else
        {
            return 1 + Math.min(Math.min(replace, remove), insert);
        }
    }
    public static void main(String args[])
    {
        String s1= "sunday";
        String s2 = "saturday"; //output = 3
        int n = s1.length();
        int m = s2.length();
        System.out.println(""+ editDis(s1,s2,n,m));
    }
}
