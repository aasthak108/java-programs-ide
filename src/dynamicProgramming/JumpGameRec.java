package dynamicProgramming;

public class JumpGameRec {
    public static boolean canReach(int[] arr, int curr) {
        if (curr >= arr.length - 1) {
            return true;
        }
        if (arr[curr] == 0) {
            return false;
        }
        for (int j = 1; j <= arr[curr]; j++) {
            if (canReach(arr, curr + j)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {2,2,1,1,1};
        System.out.println("" + canReach(arr, 0));
    }
}
