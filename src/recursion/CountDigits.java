package recursion;

public class CountDigits
{
    public static void main(String[] args)
    {
        int count = countDigits(6055, 0);
        System.out.println("Number Of Digits : "+count);
    }

    public static int countDigits(int n, int count)
    {
        if(n==0)
        {
            return count;
        }
        else
        {
            count++;
            return countDigits(n/10, count);
        }
    }
}
