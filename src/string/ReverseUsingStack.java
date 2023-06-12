package string;

import java.util.Stack;

public class ReverseUsingStack {
    static String reverseString(String str)
    {
        char[] string = new char[str.length()];
        Stack<Character> s= new Stack<Character>();
        int top=-1;
        for(int i=0;i<str.length();i++)
        {
            s.push(str.charAt(i));
        }
        int j=0;
        while(!s.empty())
        {
            string[j]=s.pop();
            j++;
        }
        return new String (string);

    }
    public static void main(String args[])
    {
        String str = "Hi";
        System.out.println("" + reverseString(str));
    }

}
