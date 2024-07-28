package arrays;

public class EquilibriumPoint {
    static int equiPoint(int arr[])
    {
        int[] sum1 = new int[arr.length];
        int[] sum2 = new int[arr.length];
        sum1[0] = arr[0];
        sum2[arr.length-1] = arr[arr.length-1];
        int k = 0;
        for (int i = 1; i < arr.length; i++) {
            sum1[i] = sum1[i - 1] + arr[i];
        }
        for (int j = arr.length - 2; j >= 0; j--) {
            sum2[j] = sum2[j + 1] + arr[j];

        }
        for (int i = 0; i < arr.length; i++) {
            if (sum1[i] == sum2[i]) {
                return i + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int arr[] = {1,3,5,2,6};
        System.out.println(equiPoint(arr));
    }
}
