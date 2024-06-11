package leetcode_Top_150;

public class CanJump {
    public static boolean canJump(int[] nums) {
        int count =0;
        int j =0;
        for(int i =0;i<=nums.length;i++){
            j = count;
            count = nums[i];
            count = count + i;

        }
        if(count + 1 == nums.length ){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        int nums [] = {2,3,1,1,4};
        System.out.println("" + canJump(nums));
    }
}
