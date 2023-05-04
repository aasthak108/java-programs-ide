package arrays;
import java.util.*;
public class RemoveDuplicates {
    static ArrayList<Integer> removeDuplicates(ArrayList<Integer> array)
    {
        ArrayList<Integer>  arr = new ArrayList<>(array);
        ArrayList<Integer> newArr = new ArrayList<>();
        for(int i=0;i<arr.size();i++)
        {
            if(!newArr.contains(arr.get(i)))
            {
                newArr.add(arr.get(i));
            }
        }
        return newArr;
    }
    public static void main(String[] args)
    {
        ArrayList array = new ArrayList<>();
        array.add(1);
        array.add(1);
        array.add(2);
        array.add(2);
        array.add(3);
        array.add(4);
        ArrayList arr1 = removeDuplicates(array);
        System.out.println(" " + arr1);
    }

}
