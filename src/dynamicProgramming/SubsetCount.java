package dynamicProgramming;
import java.util.Arrays;
public class SubsetCount {

    public static int perfectSum(int arr[],int n, int sum)
    {
        int t[][] = new int[n+1][sum+1];
        for (int i = 0; i < n + 1; i++) {
            Arrays.fill(t[i], -1);
        }
        int mod = 1000000007;
        return (res(arr,n,sum,t)%mod);
    }
   static int res(int[]arr,int n,int sum,int[][]t){
        int mod = 1000000007;
        if(t[n][sum]!= -1){
            return t[n][sum];
        }
        if(n==0 && sum>0)
            return 0;
        else if(n==1){
            if(sum==0){
                if(arr[0]==0)
                    return 2;
                else return 1;

            }
            else {
                if(arr[0]==sum)
                    return 1;
                else return 0;
            }
        }
        else if(n==0 && sum==0) return 1;
        if(arr[n-1]<=sum){
            return t[n][sum] = (res(arr,n-1,sum-arr[n-1],t)%mod+res(arr,n-1,sum,t)%mod)%mod;
        }
        else{
            return t[n][sum]= (res(arr,n-1,sum,t)%mod);

        }
    }
    public static void main(String[] args){
        int arr[] = {2,8,6,1,5,4,3};
        int n = arr.length;
        int sum =7;
        System.out.println(perfectSum(arr,n,sum));

    }
}
