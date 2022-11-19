package string;
//Number of Sub Strings starting and ending with 1//
public class BinaryString {
    public static int numberOfSubstrings(String str){
        int count =0;
        int length = str.length();
        for(int i=0;i<length;i++)
        {
            if(str.charAt(i)=='1')
            {
                count++;
            }
        }
        return count*(count-1)/2;
    }
    public static void main(String[] args)
    {
        String str = "1111";
        System.out.println(" NUmber of Sub String is/are " + numberOfSubstrings(str));
    }
}
