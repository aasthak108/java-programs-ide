package stack;

import java.util.Stack;

public class MaxGainRemovingSubString {
    int sum;
    public  String removeAB(String s, int x){
        Stack<Character> st = new Stack<>();
        for(int i=0 ;i<s.length();i++){
            if(!st.isEmpty() && st.peek()=='a' && s.charAt(i)=='b'){
                st.pop();
                sum += x;
            }else{
                st.push(s.charAt(i));
            }
        }
        StringBuilder res = new StringBuilder();
        while(!st.isEmpty()){
            res.append(st.pop());
        }
        return res.reverse().toString();
    }
    public  String removeBA(String s, int y){
        Stack<Character> st = new Stack<>();
        for(int i=0 ;i<s.length();i++){
            if(!st.isEmpty() && st.peek()=='b' && s.charAt(i)=='a'){
                st.pop();
                sum += y;
            }else{
                st.push(s.charAt(i));
            }
        }
        StringBuilder res = new StringBuilder();
        while(!st.isEmpty()){
            res.append(st.pop());
        }
        return res.reverse().toString();
    }
    public  int maxGain(String s, int x,int y){
    if(x>y){
        s = removeAB(s,x);
        s = removeBA(s,y);
    }
    if(y>x){
        s = removeBA(s,y);
        s = removeAB(s,x);
    }
    return sum;
    }
    public static void main(String args[]){

        String str1 = "cdbcbbaaabab"; // output = 19;
        int x1=4;
        int y1=5;
        int ans1 = new MaxGainRemovingSubString().maxGain(str1,x1,y1);
        System.out.println(""+ ans1);

        String str2 = "aabbaaxybbaabb"; // output = 20;
        int x2=5;
        int y2=4;
        int ans2 = new MaxGainRemovingSubString().maxGain(str2,x2,y2);
        System.out.println(" "+ ans2);
    }
}
