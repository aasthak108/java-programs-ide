package arrays;

import java.util.ArrayList;
//returning(output) the range of SubArray;
public class SubarrayWithSum {
    public static void subarrayWithSum(int arr[],int sum)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int l=0;
        int r=0;
        int s =0;
        int [] arr1 = new int[arr.length];
        while(l<=r && s<sum) {
            s = s + arr[r];
            r++;
        }
           while(l<=r && s>sum)
            {
                s = s-arr[l];
                l++;
            }
            if(s==sum)
            {
                list.add(l);
                list.add(r);
            }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {1,4,20,3,10,5};
        int sum =33;
        subarrayWithSum(arr,sum);
    }
}
