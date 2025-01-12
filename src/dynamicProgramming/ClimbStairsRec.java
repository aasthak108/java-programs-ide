package dynamicProgramming;

//to climb till n stairs need to only use steps 1 or 2
public class ClimbStairsRec
{
    public static int climbStairs(int n)
    {
        if(n==0)
        {
            return 1;
        }
        if(n<0)
        {
            return 0;
        }
        return climbStairs(n-1) + climbStairs(n-2);
    }
    public static void main(String args[])
    {
        int n =4;
        System.out.println(""+climbStairs(n));
    }
}
