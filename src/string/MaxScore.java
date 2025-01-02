package string;

public class MaxScore {
    public static int maxScore(String s) {
        int n =s.length();
        int zero[] = new int[n];
        int one[] = new int[n];
        int countZ=0;
        int countO=0;
        int max =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                countZ++;
            }
            zero[i] = countZ;

        }
        for(int i =n-1;i>=0;i--){
            if(s.charAt(i)=='1'){
                countO++;
            }
            one[i] = countO;
        }
        for(int i =0;i<n-1;i++){
            if(max<=zero[i]+one[i]){
                max = Math.max(max,zero[i]+one[i+1]);
            }
        }

        return max;
    }
    public static void main(String args[]){
        String str = "011101";
        String str1 = "1111";
        System.out.println(""+ maxScore(str));
        System.out.println(""+ maxScore(str1));
    }
}
