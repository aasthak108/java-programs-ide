package arrays;

import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int l =0;
        int r = nums.length-1;
        int arr[] = new int[2];
        while(l<r)
        {
           int sum = nums[l]+nums[r];
            if(sum==target)
            {
                return new int[]{l,r};
            }
            else if(sum<target)
            {
                l++;
            }
            else
            {
                r--;
            }
        }
        return null;

    }
    public static void main(String[] args)
    {
        int []nums = {-1,-2,-6,-4,-5};
        int arr[] = new TwoSum().twoSum(nums,-8);
        for(int i=0;i<2;i++)
        {
            System.out.print(" " + arr[i]);
        }
    }
}
