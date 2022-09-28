package recursion;

public class PowerSet {
    static void powerSet(int s,String str, String curr)
    {
        if(s==str.length())
        {
            System.out.println("" + curr);
            return;
        }
        powerSet(s+1,str,curr+ str.charAt(s));
        powerSet(s+1,str,curr);
    }
    public static void main(String[] args)
    {
        int s=0;
        String str = "ab";
        String curr = "";
        powerSet(s,str,curr);
    }
}
