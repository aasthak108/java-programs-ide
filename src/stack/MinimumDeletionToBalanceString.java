package stack;

// find minimum deletion required to balance the given string
// given string is balanced only if all a's occurs before all b's

import java.util.Stack;

public class MinimumDeletionToBalanceString {
      public static int minDeletions(String s) {

              int deletions =0;

              Stack<Character> st = new Stack<>();
              for(char ch: s.toCharArray()){
                  if(ch == 'a' && !st.isEmpty() && st.peek()=='b')
                  {
                      deletions++;
                      st.pop();

                  }
                  else{
                      st.push(ch);
                  }

              }
              return deletions;
          }

    public static void main(String args[]){
        String str = "bbaaaaabb";
        System.out.println(minDeletions(str));
    }
}
