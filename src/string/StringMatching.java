package string;

import java.util.ArrayList;
import java.util.List;

public class StringMatching
{
    public static List<String> strMatch(String[] arr)
    {
        ArrayList<String> list = new ArrayList<>();
        for(int i =0;i<arr.length;i++)
        {
            for(int j =0;j<arr.length;j++)
            {
                if(i==j)
                {
                    continue;
                }
                if(arr[i].contains(arr[j]) && !list.contains(arr[j]))
                {
                    list.add(arr[j]);
                }
            }
        }
        return list;
    }
    public static void main(String args[])
    {
        String[] str = {"leetcode", "et","code"};
        System.out.println(""+ strMatch(str));
    }
}
