package sorting;

public class CountInversion {
    static void mergeSort(int arr[],int left,int mid,int right)
    {
        int s=0,t=0;
        int k;
        int m = mid-left+1;
        int n = right-mid;
        int leftArray[] = new int[m];
        int rightArray[] = new int[n];
        for(int i =0;i<m;i++)
        {
            leftArray[s++] = arr[i];
        }
        for(int j=mid+1;j<n;j++)
        {
            rightArray[t++]= arr[j];
        }
        int i =0;
        int j =0;
        k =0;
        while(i< n && j <m)
        {
            if(leftArray[i]<=rightArray[j])
            {
                arr[k]= leftArray[i];
                i++;
            }
            else
            {
                arr[k] = rightArray[j];
                j++;
            }
        }
        while(i>n && j<m)
        {
            arr[k]= rightArray[j];
            j++;
            k++;
        }
        while(i<n && j>m) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }
    }
    static int merge(int[] arr, int left, int right)
    {
        int count=0;
        if(left<right)
        {
            int mid = left+right/2;
            count +=merge(arr,left,mid);
            count +=merge(arr,mid+1,right);
            mergeSort(arr,left,mid,right);
        }
        return count;
    }
    public static void main(String[] args)
    {
        int arr[] = {1,7,3,8,4,9,2};
        System.out.println(merge(arr,0,arr.length));
    }
}
