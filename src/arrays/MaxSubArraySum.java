package arrays;

public class MaxSubArraySum {
        public static int maxSubArray(int[] arr) {
            int curr=0;
            int max = Integer.MIN_VALUE;
            for(int i =0;i<arr.length;i++)
            {
                curr = curr+arr[i];
                if(max<curr)
                {
                    max = curr;
                }
                if(curr<0)
                {
                    curr=0;
                }
            }
            return max;
        }
        public static void main(String[] args)
        {
            int[] arr = {-1,2,-2,4,5,-4};
            System.out.println(maxSubArray(arr));
        }
    }

