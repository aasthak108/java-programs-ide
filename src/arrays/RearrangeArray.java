package arrays;

//Given an array arr[] of size N where every element is in the range from 0 to n-1.
// Rearrange the given array so that the transformed array arr[i] becomes arr[arr[i]].
//without extra space

public class RearrangeArray
{

    public static void rearrange(int []arr, int n)
    {
        for(int i =0;i<n;i++)
        {
            arr[i] = arr[i] + (arr[arr[i]] % n) *n;
        }
        for(int i =0;i<n;i++)
        {
            arr[i] = arr[i]/n;
        }
    }
    public static void main(String args[])
    {
        int arr[] = {4,0,2,1,3}; //output-> 3,4,2,0,1
        rearrange(arr, arr.length);
        for(int i =0;i<arr.length;i++)
        {
            System.out.println("" + arr[i]);
        }
     }
}
