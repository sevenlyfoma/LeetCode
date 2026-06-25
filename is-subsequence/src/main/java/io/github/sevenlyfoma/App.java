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

    public static boolean isSubsequence(String s, String t) {
        int charactersMatched = 0;
        int l = s.length();

        if (l == 0){
            return true;
        }

        for (int i = 0; i < t.length(); i++){
            if (t.charAt(i) == s.charAt(charactersMatched)){
                charactersMatched++;
                if (charactersMatched == l){
                    return true;
                }
            }
        }

        return false;
    }
}
