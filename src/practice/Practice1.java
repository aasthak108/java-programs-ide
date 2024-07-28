package practice;

public class Practice1 {
    public static void main(String[] args){
        //int n =4;
        String  arr = "abcd";
        int i =0;
        int l = arr.length();
        String s[] = new String[l*(l+1)/2];
        for(int k=0;k<l;k++){
            for(int j=k;j<l;j++){
                s[i] = arr.substring(k,j+1);
                i++;
            }
        }
        for(int u=0;u<s.length;u++){
            System.out.println(""+ s[u]);
        }
    }

}
