package arrays;
//used hash array to count the frequencies
public class FindMissingNumInRangeUsedHashArray
{
    public static int findMissingNum(int arr[])
    {
        int n = arr.length;
        int hash [] = new int[n+1];
        for(int i =0;i<n-1;i++)
        {
            hash[arr[i]]++;
        }
        for(int i =1;i<=n;i++)
        {
            if(hash[i]==0)
            {
                 return i;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        int arr[] = {0,1,3,4};
        System.out.println(""+ findMissingNum(arr));
    }
}
