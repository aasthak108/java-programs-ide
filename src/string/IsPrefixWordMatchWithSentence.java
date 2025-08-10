package string;
// given sentence and searchWord , if search word is prefix of any words in string then
// return the index of that word from string else return -1
public class IsPrefixWordMatchWithSentence {

    public static int isPrefix(String sentence, String searchWord)
    {
        int n = sentence.length();
        int m = searchWord.length();
        StringBuilder sb = new StringBuilder();
        int count =1;
        for(int i =0;i<n;i++)
        {
            char ch = sentence.charAt(i);
            if(ch==' ')
            {
                sb.setLength(0);
                count++;
                continue;
            }
            sb.append(ch);
            if(sb.length()==m && sb.toString().equals(searchWord))
            {
                return count;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        String s1 = "I am happy";
        String s2 = "ha";
        System.out.println(""+ isPrefix(s1,s2));
    }
}
/* class Solution {
    public int countGoodStrings(int low, int high, int zero, int one) {
        String s0 = " ";
        String s1 = " ";
        String str2 = " ";
        for(int i =0;i<zero;i++){
            s0 = s0+"0";
        }
        for(int i =0;i<one;i++){
            s1 = s1+"1";
        }
        return helper(low,high,len,str1,s1,s0);
    }
    public static int helper(int low,int high, int len,String str2,String s1,String s0){
        if(str2.length()== low && str2.length()<=high){
            int oneCount = helper(low,high--,str.length(),str2+s1,s0);
            int zeroCount = helper(low,high--, str.length(), s1,str2+s0);
        }
        if(high==0)
        {
            return oneCount + zeroCount;
        }

    }
}*/