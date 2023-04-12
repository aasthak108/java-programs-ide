package arrays;

public class TotalFood {
    public static int food(int arr[],int r,int unit) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (sum >= r * unit) {
                return i + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int[] arr= {2 ,1, 3, 5, 7, 4, 1, 2};
        int r = 7;
        int unit =2;
        System.out.println(food(arr,r,unit));
    }
}
