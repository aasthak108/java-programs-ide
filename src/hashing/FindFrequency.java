package hashing;
import java.util.HashMap;
import java.util.Map;

class FindFrequency {

    public static void findFrequency(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i] )+ 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            System.out.println("" + m.getKey() + " " + m.getValue());
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 4, 5, 6, 7, 7};
        int n = arr.length;
        findFrequency(arr, n);
    }
}
