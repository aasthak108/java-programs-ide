package searching;
import java.util.Arrays;

public class KthSmallestNumber {
    static int kthSmallestNum(int arr[],int k)
    {
        Arrays.sort(arr);
        return arr[k-1];
    }
    public static void main(String[] args)
    {
        int arr[] = {3,5,4,2,9};
        int k = 4;
        System.out.println(kthSmallestNum(arr,k));
    }
}
