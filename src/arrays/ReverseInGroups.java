package arrays;

public class ReverseInGroups
{
    public static void reverseInGroups(int arr[], int k)
    {
        for(int i =0;i<arr.length;i += k)
        {
            int left =i;
            int right = Math.min(i+k-1,arr.length-1);
            if(right>arr.length-1)
            {
                right = arr.length-1;
            }
            swap(arr, left, right);
        }
    }
    public static void swap(int arr[], int left, int right)
    {
        while(left<right)
        {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5,6};
        reverseInGroups(arr,3);
        for(int i =0;i<arr.length;i++)
        {
            System.out.println(""+ arr[i]);
        }
    }
}
/////ReverseInGroups Using ArrayList////////

/*
void reverseInGroups(ArrayList<Long> arr, int k) {
       for(int i =0;i<arr.size(); i+=k){
           int l = i;
           int r = Math.min(i+k-1,arr.size()-1);
           if(r>arr.size()-1){
               r = arr.size()-1;

           }
            reverse(arr,l,r);
       }
    }
    void reverse(ArrayList<Long> arr, int left, int right){
        while(left<right){
            long temp = arr.get(left);
            arr.set(left,arr.get(right));
            arr.set(right,temp);
            left++;
            right--;
        }
    }
 */