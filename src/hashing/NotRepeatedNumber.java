package hashing;

import java.util.HashMap;
import java.util.Map;

public class NotRepeatedNumber {
    static int notRepeatedNumber(int[] arr,int n)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count =0;
        for(int i=0;i<n;i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
            for(Map.Entry<Integer,Integer> m:map.entrySet())
            {
                if(m.getValue()==1)
                {
                    System.out.println(m.getKey()+"");
                    count++;
                }
            }
        return count;
    }
    public static void main(String[] args)
    {
        int arr[] ={1,1,1,2,3,4,5,6,8};
        int n = arr.length;
        System.out.println(notRepeatedNumber(arr,n));
    }
}
