package searching;

public class isPair {
    public static int isPairOrNot(int arr[], int l, int r, int x) {
        while (l < r) {
            if (arr[l] + arr[r] == x) {
                return 1;
            } else if (arr[l] + arr[r] > x) {
                return isPairOrNot(arr, l, r - 1, x);
            } else if (arr[l] + arr[r] < x) {
                return isPairOrNot(arr, l + 1, r, x);
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = {1, 3, 5, 6, 8, 9};
        int x = 1;
        int l = 0;
        int r = arr.length - 1;
        System.out.println(isPairOrNot(arr, l, r, x));
    }
}
