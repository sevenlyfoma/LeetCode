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

    public int strStr(String haystack, String needle) {
        char n = needle.charAt(0);


        boolean found  = false;

        int i = 0;

        while (!found && i < haystack.length() - needle.length() + 1){
            char c = haystack.charAt(i);

            if (c == n){

                boolean matches = true;
                int j = 1;

                while (matches && j < needle.length()){
                    if (needle.charAt(j) != haystack.charAt(j+i)){
                        matches = false;
                    }
                    j ++;
                }

                if (matches){
                    found = true;
                }


            }


            i++;
        }

        if (!found){
            return -1;
        }

        return i-1;
    }
}
