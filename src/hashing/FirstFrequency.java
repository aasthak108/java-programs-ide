package hashing;

import java.util.HashSet;
public class FirstFrequency {
    static int firstFrequency(int[] arr) {
        int j = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=arr.length-1;i>=0;i--)
        {
            if(set.contains(arr[i]))
            {
                j=i;
            }
            else
            {
                set.add(arr[i]);
            }
        }
        return j;
    }
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,3};
        System.out.println(firstFrequency(arr));
    }

}
