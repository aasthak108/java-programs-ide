package leetcode_Top_150;

public class RemoveDuplicatesSecondVersion {

    //Allowed to keep atmost 2 same elements

    public static int removeDuplicates(int arr[]){
        int count =1;
        int j =1;
        for(int i =1;i<arr.length;i++){
            if(arr[i] == arr[i-1]){
                count++;
            }
            else{
                count = 1;
            }
            if(count<=2){
                arr[j] = arr[i];
                j++;
            }

        }
        return j;
    }
    public static void print(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.println(""+ arr[i]);
        }
    }
    public static void main(String args[]){
        int arr[] = {1,1,1,2,2,3,4,4};
        System.out.println(""+ removeDuplicates(arr));
        print(arr);
    }

}
