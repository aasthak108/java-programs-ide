package searching;

public class twoRepeatedElement {
    public static int[] twoRepeatedElement(int arr[], int N)
    {
        int[] arr1 = new int[2];
        int k=0;
        for(int i =0;i<N+1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                arr1[k++]=arr[i];
            }
        }
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]==arr[arr.length-1])
            {
                arr1[k] = arr[j];
            }
        }
        return arr1;
    }
    public static void main(String[] args)
    {
        int arr[] ={1,2,3,3,4,1};
        int N = arr.length-2;
        int i;
        int[] array = new twoRepeatedElement().twoRepeatedElement(arr,N);
        for(i=0;i<array.length;i++)
        {
            System.out.println("The required element are " + array[i]);
        }
    }

}
