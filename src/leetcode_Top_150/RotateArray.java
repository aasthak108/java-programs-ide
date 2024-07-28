package leetcode_Top_150;

    public class RotateArray {
    public static void rotateArray(int arr[], int k){
    k = k % arr.length;
    rev(arr,0,arr.length-1);
    rev(arr,0,k-1);
    rev(arr,k,arr.length-1);
    }
    public static int[] rev(int arr[],int s,int e){
        while(s<e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        return arr;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7};
        rotateArray(arr,3);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
