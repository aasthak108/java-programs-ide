package arrays;

public class TotalFood {
    public static String food(int n ){
        int sum = 0;
            for(int i=1;i<n;i++)
            {
                if(n%i==0)
                {
                    sum = sum+i;
                }
                if(sum==n)
                {
                    return "YES";
                }
            }
            return "NO";
        }
    public static void main(String[] args)
    {
        int n =28;
        System.out.println(food(n));
    }
}
