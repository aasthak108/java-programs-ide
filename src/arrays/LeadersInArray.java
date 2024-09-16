package arrays;

import java.util.ArrayList;
import java.util.Collections;

public class LeadersInArray
{
    public static ArrayList<Integer> findLeaders(int arr[])
    {
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        int currMax = arr[n-1];
        list.add(currMax);
        for(int i =n-2;i>=0;i--)
        {
            if(arr[i]>=currMax)
            {
                currMax = arr[i];
                list.add(currMax);
            }
        }
        Collections.reverse(list);
        return list;
    }
    public static void main(String args[])
    {
        int arr[] = {16,17,4,3,5,2};
        System.out.println(""+findLeaders(arr));
    }
}
