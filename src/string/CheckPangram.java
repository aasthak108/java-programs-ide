package string;

public class CheckPangram
{
//pangram-> contains all letter of english alphabet
    public static boolean checkIfPangram(String sentence)
    {
        for(char ch ='a';ch<='z';ch++)
        {
            boolean found = false;
            for(int i =0;i<sentence.length();i++)
            {
                if(ch== Character.toLowerCase(sentence.charAt(i)))
                {
                    found = true;
                    break;
                }
            }
            if(found == false)
            {
                return false;
            }

        }
        return true;
    }
    public static void main(String args[])
    {
        String str = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(""+ checkIfPangram(str));
    }

}
