package arrays;

//rearrange array alternately between max, min, wndMax, 2ndMin, 3rdMax, 3rdMin...so on
// used two pointer technique

public class RearrangeArrayAlternately {
    public static void rearrange(int arr[]){
        int res[] = new int[arr.length];
        boolean flag = true;
        int low =0;
        int high = arr.length-1;
        for(int i =0;i<arr.length;i++){
            if(flag){
                res[i] = arr[high--];
            }
            else{
                res[i] = arr[low++];
            }
            flag = !flag;
        }
        for(int i =0;i<arr.length;i++){
            arr[i] = res[i];
        }
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6};
        rearrange(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(""+ arr[i]);
        }
    }
}
