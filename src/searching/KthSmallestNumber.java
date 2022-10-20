package searching;
import java.util.Arrays;

public class KthSmallestNumber {
    static int kthSmallestNum(int array[],int k)
    {
        Arrays.sort(array);
        return array[k-1];
    }
    public static void main(String[] args)
    {
        int array[] = {3,5,4,2,9};
        int k = 4;
        System.out.println(kthSmallestNum(array,k));
    }
}
