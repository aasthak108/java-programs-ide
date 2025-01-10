package string;

import java.util.ArrayList;
import java.util.List;

public class StringMatching
{
    public static List<String> strMatch(String[] arr)
    {
        ArrayList<String> list = new ArrayList<>();
        for(int k =0;k<arr.length;k++)
        {
            for(int j =0;j<arr.length;j++)
            {
                if(k==j)
                {
                    continue;
                }
                if(arr[k].contains(arr[j]) && !list.contains(arr[j]))
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
