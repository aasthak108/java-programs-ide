package string;

import java.util.Stack;

public class ReverseWordsInString
{
    public static String revWords(String str)
    {
        Stack<String> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<str.length();i++)
        {
            if(str.charAt(i) != ' ')
            {
                sb.append(str.charAt(i));
            }
            else if(sb.length()>0)
            {
                st.push(sb.toString());
                sb.setLength(0);
            }
        }
        if(sb.length()>0)
        {
            st.push(sb.toString());
        }
        StringBuilder res = new StringBuilder();
        while(!st.isEmpty())
        {
            res.append(st.pop());
            if(!st.isEmpty())
            {
                res.append(" ");
            }
        }
        return res.toString();
    }
    public static void main(String args[])
    {
        String str = "the sky is blue";
        System.out.println(""+ revWords(str));
    }
}
