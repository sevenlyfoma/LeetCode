package io.github.sevenlyfoma;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( isPalindrome(".,") );
    }


    public static boolean isPalindrome(String s) {

        int lp = 0;
        int rp = s.length() - 1;

        boolean isPalindrome = true;

        char lc = 0;
        char rc = 0;

        while (isPalindrome && lp < rp && lp < s.length() && rp >= 0){
            // char lc = s.charAt(lp);
            // char rc = s.charAt(rp);

            boolean leftFound = false;

            while (!leftFound && lp < s.length()){
                char lcx = s.charAt(lp);
                lp++;

                if ((lcx >= 65 && lcx <= 90) || (lcx >= 97 && lcx <= 122) || (lcx >= 48 && lcx <= 57)){
                    leftFound = true;
                    
                    lc = lcx;

                    if (lc >= 65 && lc <= 90) {
                        lc += 32;
                    }
                }
            }

            boolean rightFound = false;

            while (!rightFound && rp >= 0){
                char rcx = s.charAt(rp);
                rp--;

                if ((rcx >= 65 && rcx <= 90) || (rcx >= 97 && rcx <= 122) || (rcx >= 48 && rcx <= 57)){
                    rightFound = true;
                    
                    rc = rcx;

                    if (rc >= 65 && rc <= 90){
                        rc += 32;
                    }
                }
            }

            if (lc != rc){
                isPalindrome = false;
            }
        }
        

        return isPalindrome;
    }
}
