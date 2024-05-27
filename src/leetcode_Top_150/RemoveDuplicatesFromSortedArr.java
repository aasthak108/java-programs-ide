package leetcode_Top_150;

public class RemoveDuplicatesFromSortedArr {
    public static void removeDuplicatesFromSortedArr(int arr[]) {
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[count] = arr[i];
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.println("" + arr[i]);
        }
        System.out.println("unique element count is " + count);
    }



    public static void main(String args[]){

        int arr[] = {0,0,1,1,1,2,2,3,4,4,4};
        removeDuplicatesFromSortedArr(arr);

    }
}
