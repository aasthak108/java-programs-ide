package string;
//s2 = s1 then return true
public class IsRotatedByTwoPlace {

    public static boolean isRotated(String s1, String s2){
        int n = s1.length();
        if(s1.length() != s2.length()){
            return false;
        }
        if(s1.length()<=2){
            return s1.equals(s2);
        }
        String clockWise = s1.substring(n-2) + s1.substring(0,n-2);
        String antiClockwise = s1.substring(2) + s1.substring(0,2);
        return s2.equals(clockWise) || s2.equals(antiClockwise);
    }
    public static void main(String args[]){
        String s1 = "amazon";
        String s2 = "azonam";
        System.out.println("" + isRotated(s1,s2));

    }

}
