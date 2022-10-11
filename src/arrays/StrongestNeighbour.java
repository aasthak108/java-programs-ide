package arrays;


class StrongestNeighbour
{
    static int[] getStrongestNeighbour(int arr[])
    {
        int[] result = new int[arr.length];
        int length = arr.length;
        int count =0;
        for(int i=0;i<length-1;i++)
        {
            if(arr[i]<=arr[i+1])
            {
                result[i]=arr[i+1];
            }
            else if(arr[i]>=arr[i+1])
            {
                count++;
                result[i]=arr[i+count+1];
            }
            else
            {
                result[i]=arr[i];
            }
        }
        return result;
    }
    public static void main(String args[])
    {
        int arr[] = {1,2,2,3,4,5};
        int[] array1 = new StrongestNeighbour().getStrongestNeighbour(arr);
        for(int i=0;i<array1.length;i++)
        {
            System.out.print(" "+array1[i]);
        }
    }
}

