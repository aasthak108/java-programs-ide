package arrays;

public class SecondMax
{
    public static void main(String[] args)
    {
        int[] ipArray = {6,8,1,4,6,200,78,99,202,201,10,79,101,99,100};
        System.out.println("SecondMax: "+getSecondMax(ipArray));
    }

    private static int getSecondMax(int arr[])
    {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                secondMax=max;
                max=arr[i];
            }
            else if(secondMax<arr[i] && max >arr[i])
            {
                secondMax=arr[i];
            }
        }
        return secondMax;
    }
}
