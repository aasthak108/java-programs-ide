package arrays;

public class SecondMax
{
    public static void main(String[] args)
    {
        int[] ipArray = {6,8,1,4,6,200,78,99,202,202,10,79,101,99,100};
        System.out.println("SecondMax: "+getSecondMax(ipArray));
    }

    private static int getSecondMax(int ipArray[]) {
        int max =0;
        int max2 = -1;
        for(int i=0;i<ipArray.length;i++)
        {
            if(ipArray[i]>max)
            {
                max = ipArray[i];
            }
        }
        for(int i=0;i<ipArray.length;i++)
        {
            if(ipArray[i]<max && ipArray[i]>max2)
            {
                max2 = ipArray[i];
            }
        }
        return max2;

    }
}
