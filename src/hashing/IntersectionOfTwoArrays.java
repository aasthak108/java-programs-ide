package hashing;
import java.util.HashSet;
public class IntersectionOfTwoArrays {
    static void intersectionOfTwoArrays(int arr1[],int arr2[])
    {
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0;i<arr1.length;i++)
        {
            hs.add(arr1[i]);
        }
        for(int i =0;i<arr2.length;i++)
        {
            if(hs.contains(arr2[i]))
            {
                System.out.println(""+arr2[i]);
            }
        }
    }
    public static void main(String[] args)
    {
        int arr1[]={1,2,3,4,7,5};
        int arr2[] ={1,2,3,6,7,8};
        intersectionOfTwoArrays(arr1,arr2);
    }


}
