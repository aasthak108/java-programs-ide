package leetcode_Top_150;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int count=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i] != val){
                nums[count++] = nums[i];
            }
        }
        return count;
    }
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(""+ arr[i]);
        }
    }
    public static void main(String args[]){

        int nums[] = {2,3,3,2};
        int val = 2;
        removeElement(nums,val);
        print(nums);

    }

}
