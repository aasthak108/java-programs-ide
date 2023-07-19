package dynamicProgramming;

public class EqualSumPartitionTD {
    static boolean canPartition(int n, int[] arr) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        if (sum % 2 != 0) {
            return false;
        }
        return check(n, sum / 2, arr);
    }

    static boolean check(int n, int sum, int[] arr) {
        boolean t[][] = new boolean[n + 1][sum + 1];
        boolean res = false;
        for (int i = 1; i < n + 1; i++){
            t[i][0] = false;
    }
        for(
    int j = 0;
    j<sum+1;j++)

    {
        t[0][j] = true;
    }
        for(
    int j = 1;
    j<n+1;j++)

    {
        for (int i = 1; i < sum + 1; i++) {
            if (arr[j - 1] <= i) {
                t[j][i] = t[j - 1][i - arr[j - 1]] || t[j - 1][i];
            } else {
                t[j][i] = t[j - 1][i];
            }
        }
    }
        return t[n][sum];
}


    public static void main(String[] args){
        int arr[] = {1,5,5,11};
        int n =arr.length;
        System.out.println(""+ canPartition(n,arr));
    }

}

