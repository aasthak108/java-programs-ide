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
