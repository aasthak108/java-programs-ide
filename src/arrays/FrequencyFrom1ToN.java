package arrays;

import java.util.HashMap;

public class FrequencyFrom1ToN {
    public static void findFrequency(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        int N = arr.length;
        for(int i = 0; i <N; i++) {
            if (arr[i] >= 1 && arr[i] <= N) {
                if (map.containsKey(arr[i])) {
                    map.put(arr[i], map.get(arr[i]) + 1);
                } else {
                    map.put(arr[i], 1);
                }

            }
        }
        for(int i=0;i<N;i++){

            arr[i] = map.getOrDefault(i+1,0);

        }
    }

    public static void main(String args[]){
        int arr[] = {1,2,2,4,5};
        findFrequency(arr);
        for(int i =0;i<arr.length;i++){
            System.out.println("" + arr[i]);
        }
    }
}
