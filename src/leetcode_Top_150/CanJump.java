package leetcode_Top_150;

public class CanJump {
    public static boolean canJump(int[] nums) {
        int i=0;
        int count =0;
        while(i <= nums.length){
            count = nums[i];
        }
        i = i+ count;
        if(i >= nums.length){
            return true;
        }
        i = i + nums[i];

        return false;
    }
    public static void main(String args[]){
        int nums [] = {2,3,1,1,4};
        System.out.println("" + canJump(nums));
    }
}
