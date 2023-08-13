package string;
import java.util.*;
public class RemainingFrequency {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int count=0;
            String s = sc.nextLine();
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < s.length(); i++) {

                for (int j = i+1; j < s.length(); j++) {
                    if (s.charAt(i) ==s.charAt(j)) {
                        count++;
                    }
                }

                result.append(count);
                count=0;
            }


            System.out.println(result.toString());
        }
    }
    
