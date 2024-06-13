package leetcode_Top_150;

public class CanJump {
    public static boolean canJump(int[] nums) {
        int count = 0;
        int j = 0;
        for (int i = 0; i < nums.length-1; i++) {

            i = j;
            count = nums[i];
            j = j + count;

        }
        if (j+1 == nums.length || j+1 >= nums.length) {
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        int nums [] = {4,2,1,0,4,9};
        System.out.println("" + canJump(nums));
    }
}
