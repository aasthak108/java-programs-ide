package dynamicProgramming;

public class SubsetSumProblem {

    static boolean isSubset(int sum, int n, int arr[]) {
    boolean t[][] = new boolean[sum+1][n+1];
    int count =0;
    int k=0;
        int a[] = new int[sum/2];
    for(int i=1;i<sum+1;i++){
        t[i][0]=false;
    }
    for(int j=0;j<n+1;j++){
        t[0][j]=true;
    }
    for(int i=1;i<sum+1;i++){
        for(int j=1;j<n+1;j++){
            if(arr[j-1]<=i){
                t[i][j]= t[i-arr[j-1]][j-1] || t[i][j-1];
            }
            else{
                t[i][j]=t[i][j-1];
            }
        }
    }
    for(int i=n;i<=n;i++){
        for(int j=0;j<sum/2;j++){
            a[k]=j;
            k++;
        }
    }
    for(int i=0;i<a.length;i++) {
        System.out.println("" + a[i]);
    }
    return t[sum][n];
    }
    public static void main(String[] args){
        int arr[]= {2, 4, 4,3};
        int sum =6;
        int n = arr.length;
        System.out.println(""+ isSubset(sum,n,arr));

    }
}