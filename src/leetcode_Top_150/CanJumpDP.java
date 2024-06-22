package leetcode_Top_150;

public class CanJumpDP {
    public static boolean jumpGameDP(int[] arr){
        int n = arr.length;
        boolean dp[] = new boolean[n];
        dp[0] = true;
        int num = 0;
        for(int i=0;i<n;i++){
            if(dp[i]){
                int count = Math.min(i + arr[i], n-1);
                for(int j = i+1;j<= count;j++){

                    dp[j] = true;
                    if(j == n-1){
                        return true;
                    }
                }
            }
        }
        return dp[n-1];
    }
    public static void main(String args[]){
        int arr[] = {2,3,1,1,4};
        System.out.println("" + jumpGameDP(arr));

    }
}
