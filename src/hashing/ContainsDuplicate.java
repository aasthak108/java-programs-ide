package hashing;
import java.util.HashMap;
import java.util.Map;
public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (m.getValue() >= 2) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        int arr[] ={1,1,1,2,3,4,5,6,8};
        System.out.println(containsDuplicate(arr));
    }

}
