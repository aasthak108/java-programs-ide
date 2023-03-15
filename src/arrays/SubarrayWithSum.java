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
            for(int i=0;i<arr.length;i++) {
                s = s + arr[i];
                r = i;
                while (s > sum) {
                    s = s - arr[l];
                    l++;
                }
                if (s == sum) {
                   break;
                }
            }
            if(s!=sum)
            {
                list.add(-1);
            }
            else {
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
