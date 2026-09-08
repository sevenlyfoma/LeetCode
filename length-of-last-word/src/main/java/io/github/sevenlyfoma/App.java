package io.github.sevenlyfoma;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static int lengthOfLastWord(String s) {
        int i = s.length()-1;


        boolean found = false;

        int count = 0;
        
        boolean firstLetterFound = false;

        while (!found && i >= 0){

            char c = s.charAt(i);

            if (c == ' '){
                if (firstLetterFound){
                    found = true;
                }
            }
            else{
                if (!firstLetterFound){
                    firstLetterFound = true;
                }
                count++;
            }


            i--;
        }


        return count;
    }
}
