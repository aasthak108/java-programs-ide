package arrays;

import java.util.Arrays;

public class ThreeSum {
    static boolean check(int n,int sum,int [] arr){
        Arrays.sort(arr);

        for (int i = 0; i < n - 2; i++) {
            int l = i + 1;
            int r = n - 1;

            while (l < r) {
                int currentSum = arr[i] + arr[l] + arr[r];

                if (currentSum == sum) {
                    return true;
                } else if (currentSum < sum) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        int arr[] = {1 ,4 ,45, 6, 10, 8};
        int sum =13;
        int n = arr.length;
        System.out.println(""+ check(n,sum,arr));
    }

}
