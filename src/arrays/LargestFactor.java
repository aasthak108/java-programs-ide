package arrays;

public class LargestFactor {
    public static int largestFactor(int n,int d){
        int max=0;
        int count=0;
        int max2=0;
        for(int i=n;i>=1;i--) {
            if (n % i == 0) {
                count++;
            }
            if (count == d) {
                return i;
            }
        }
        return 1;
    }
    public static void main(String[] args){
        int n =12;
        int d=4;
        System.out.println(largestFactor(n,d));
    }

}
