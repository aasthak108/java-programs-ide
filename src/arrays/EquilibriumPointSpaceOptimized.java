package arrays;

public class EquilibriumPointSpaceOptimized {
    public static int equilibriumPoint(int arr[]){
        int left=0;
        int right=0;
        int pivot=0;
        for(int i =1;i<arr.length;i++){
            right = right+arr[i];

        }
        while(pivot<arr.length-1 && left!=right){
            pivot++;
            right = right-arr[pivot];
            left = left+arr[pivot-1];
        }
        return (left==right)?pivot+1:-1;
    }
    public static void main(String args[]){
        int arr[] = {1,3,5,2,2};
        System.out.println(""+equilibriumPoint(arr));
    }
}
