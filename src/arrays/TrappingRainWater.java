package arrays;

//Given an array arr[] with non-negative integers representing the height of blocks.
// If width of each block is 1,
// compute how much water can be trapped between the blocks during the rainy season.

public class TrappingRainWater
{
    public static int trappingWater(int arr[], int n)
    {

        int[] left= new int[n];
        int[] right = new int[n];
        int ans=0;
        left[0] =arr[0];
        right[n-1] = arr[n-1];
        for(int i =1;i<n;i++)
        {
            left[i] = Math.max(left[i-1],arr[i]);
        }
        for(int i = n-2;i>=0;i--)
        {
            right[i] = Math.max(right[i+1],arr[i]);
        }
        int l=0,r=0,res=0,diff=0,k=0;
        while(l<n && r<n)
        {
            res = Math.min(left[l++],right[r++]);
            diff = res-arr[k++];
            ans = ans+diff;
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int arr[] = {3,0,0,2,0,4}; //output-> 10
        int n = arr.length;
        System.out.println(""+ trappingWater(arr,n));
    }
}
