package arrays;

public class Sort012 {
    public static int[]  sort012(int arr[]) {
        int low = 0;
        int mid = 0;
        int high = arr.length-1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                mid++;
                low++;
            }
            else if (arr[mid] == 1) {
                mid++;
            }
            else if (arr[mid] == 2) {
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;

            }
        }
        return arr;
    }
    public static void main(String[] args)
    {
        int arr[] ={1,0,2,1,2,1};
        int[] array = new Sort012().sort012(arr);
        for(int i =0;i<array.length;i++)
        {
            System.out.print(" " + array[i]);
        }
        System.out.print("");
    }
}
