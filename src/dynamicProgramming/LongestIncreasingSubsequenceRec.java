package dynamicProgramming;

public class LongestIncreasingSubsequenceRec {
    public static int lis(int arr[], int curr, int prev)
    {
        if(curr==arr.length)
        {
            return 0;
        }
        int include =0;
        int exclude = lis(arr,curr+1,prev);
        if(prev ==-1 || arr[curr]>arr[prev])
        {
            include = lis(arr,curr+1,prev+1) +1;
        }
        return Math.max(include,exclude);
    }
    public static void main(String args[])
    {
        int arr[] = {10,22,9,33};
        System.out.println("" + lis(arr,0,-1));
    }
}
