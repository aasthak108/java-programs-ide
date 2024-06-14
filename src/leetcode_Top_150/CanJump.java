package leetcode_Top_150;

public class CanJump {
    public static boolean canJump(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if(count<i){
                return false;
            }
            count = Math.max(nums[i] + i, count);

        }
        if (count >= nums.length) {
            return true;
        }
        return true;
    }
    public static void main(String args[]){
        int nums [] = {1,0,1,0};
        System.out.println("" + canJump(nums));
    }
}
