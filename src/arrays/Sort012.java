package arrays;

public class Sort012 {
    public static void  sort012(int arr[])
    {
        int temp;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(" " +arr[i]);

        }
    }
    public static void main(String[] args)
    {
        int arr[] ={1,0,2,1,2,1};
        sort012(arr);
    }
}
