package string;

public class CommonPrefix {
    static String common(String s1, String s2){
        StringBuilder sb = new StringBuilder();
        int n = Math. min(s1.length(),s2.length());
        for(int i=0;i<n;i++){
            if(s1.charAt(i)==s2.charAt(i))
            {
                sb.append(s1.charAt(i));
            }
            else{
                break;
            }
        }
        return sb.toString();
    }
    public static String  commonPrefix(String [] strs){
        String res = strs[0];
        for(int i=1;i<strs.length;i++){
            res = common(res,strs[i]);
        }
        return res;

    }
    public static void main(String[] args) {
        String[] strs = {"Flower", "Flow", "Flight"};
        System.out.println(commonPrefix(strs));
    }

}
