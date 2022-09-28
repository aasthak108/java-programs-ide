package arrays;

public class SecondMax
{
    public static void main(String[] args)
    {
        int[] ipArray = {6,8,1,4,6,200,78,99,202,201,10,79,101,99,100};
        System.out.println("SecondMax: "+getSecondMax(ipArray));
    }

    private static int getSecondMax(int ipArray[])
    {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MAX_VALUE;
        for(int i=0;i<ipArray.length;i++)
        {
            if(max<ipArray[i])
            {
                secondMax=max;
                max=ipArray[i];
            }
            else if(secondMax<ipArray[i] && max >ipArray[i])
            {
                secondMax=ipArray[i];
            }
        }
        return secondMax;
    }
}
