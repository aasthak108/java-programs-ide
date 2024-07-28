package leetcode_Top_150;

public class CanJumpRecursion {
    public static boolean canJumpRecursion(int[] arr, int position ){

        if(arr.length == 0 ){
            return false;
        }
        if(position >= arr.length){
            return true;
        }
        int count = Math.min((position + arr[position]) , arr.length);
        for(int i =position +1; i<= count;i++){
            if(canJumpRecursion(arr,i)){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int [] arr = {2,3,0,1,4};
        System.out.println(canJumpRecursion(arr,0));
    }
}
