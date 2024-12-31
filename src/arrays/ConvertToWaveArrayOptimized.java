package arrays;
//without sorting
public class ConvertToWaveArrayOptimized
{
    public static void convertToWave(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < arr.length - 1; i++)
        {
            if (i % 2 == 0)
            {
                if (arr[i] < arr[i + 1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            } else if (i % 2 != 0)
            {
                if (arr[i] > arr[i + 1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i +1];
                    arr[i +1] = temp;
                }
            }

        }
    }
    public static void main(String args[])
    {
        int[] arr= {90,10,60,57,55};
        convertToWave(arr);
        for(int i =0;i<arr.length;i++)
        {
            System.out.print(" " + arr[i]);
        }
    }

}
