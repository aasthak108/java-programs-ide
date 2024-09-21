package arrays;

//rearrange array alternately between max, min, wndMax, 2ndMin, 3rdMax, 3rdMin...so on
// Modulo technique
//SC->O(1)

public class RearrangeArrayOptimizedSpace {

    public static void rearrange(int arr[]){
        int n = arr.length;
        int maxInd = n-1;
        int minInd=0;
        int M = arr[n-1]+1;
        for(int i =0;i<n;i++){
            if(i%2==0){
                arr[i] = arr[i] + (arr[maxInd] % M) * M;
                maxInd--;
            }
            else{
                arr[i] = arr[i] + (arr[minInd] % M) * M;
                minInd++;
            }
        }
        for(int i =0;i<n;i++){
            arr[i] = arr[i] /M;
        }
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6};
        rearrange(arr);
        for(int i =0;i<arr.length;i++){
            System.out.println("" + arr[i]);
        }
    }
}
