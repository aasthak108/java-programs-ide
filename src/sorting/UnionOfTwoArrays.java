package sorting;

public class UnionOfTwoArrays {
    public static int[] unionOfTwoArrays(int arr1[],int arr2[])
    {
        int n = arr1.length;
        int m = arr2.length;
        int i=0,j=0;
        int []arr = new int[5];
        int k=0;
        while( i<n &&  j<m)
        {
            if(arr1[i]==arr2[j] && arr1[i]!=arr1[i-1] && arr.length>0)
            {
                arr[k]=arr1[i];
                i++;
                j++;
                k++;
            }
            else if(arr1[i]<arr2[j] && arr1[i-1]!=arr1[i])
            {
                arr[k]=arr1[i];
                i++;
                j++;
                k++;
            }
            else if(arr2[j]<arr1[i] && arr2[j]!=arr2[j-1])
            {
                arr[k] = arr2[j];
                j++;
                i++;
                k++;
            }
            else if(arr1[i]==arr1[i-1])
            {
                arr[k] = arr2[j];
                i++;
                k++;
            }
        }
        while(i<n)
        {
            arr[k]=arr1[i];
            i++;
            k++;
        }
        while(j<m)
        {
            arr[k] = arr2[j];
            j++;
            k++;
        }
        return arr;
    }
    public static void main(String[] args)
    {
        int arr1[] = {1,1,3,4,5};
        int arr2[] = {1,2,3};
        int array[] = new UnionOfTwoArrays().unionOfTwoArrays(arr1,arr2);
        for(int i=0;i<5;i++)
        {
            System.out.println(""+array[i]);
        }
    }
}
