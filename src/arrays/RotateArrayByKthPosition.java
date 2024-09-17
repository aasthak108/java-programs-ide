package arrays;

public class RotateArrayByKthPosition {
    public static void  rotate(int arr[], int k){
        int n = arr.length;
        k = k%n;
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        reverse(arr,0,n-1);
    }
    public static void reverse(int arr[], int left, int right){
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        int k =2;
        reverse(arr,0, k-1);
        reverse(arr,k,arr.length-1);
        reverse(arr,0,arr.length-1);
        for(int i =0;i<arr.length;i++){
            System.out.println(""+ arr[i]);
        }
    }
}
