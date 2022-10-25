package recursion;

public class StringPermutation {
    static void stringPermutation(int s,String str,String curr)
    {
        if(s==str.length())
        {
            System.out.println("" + curr);
            return;
        }
        stringPermutation(s+1,str,curr +str.charAt(s)+str.charAt(s+1));
        stringPermutation(s+1,str,curr+str.charAt(s+1)+str.charAt(s));
    }
    public static void main(String[] args)
    {
        int s=0;
        String str = "dav";
        String curr = "";
        stringPermutation(s,str,curr);
    }
}

