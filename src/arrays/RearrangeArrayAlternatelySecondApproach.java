package arrays;

//rearrange array alternately between max, min, wndMax, 2ndMin, 3rdMax, 3rdMin...so on
// used two pointer technique

public class RearrangeArrayAlternatelySecondApproach {
        public static void rearrange(int arr[]){
            int res[] = new int[arr.length];
            int low =0;
            int high = arr.length-1;
            for(int i =0;i<arr.length;i++){
                if(i%2==0){
                    res[i] = arr[high--];
                }
                else{
                    res[i] = arr[low++];
                }
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
