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

    public static String longestCommonPrefix(String[] strs) {
        int length = 0;

        boolean matching = true;

        while (matching){

            if (strs[0].length() <= length){
                matching = false;
            }
            else{
                char target = strs[0].charAt(length);

                for (int i = 1; i < strs.length; i++){
                    if (length == strs[i].length()){
                        matching = false;
                        i = strs.length;
                    }
                    else{
                        char c = strs[i].charAt(length);

                        if (c != target){
                            matching = false;
                            i = strs.length;
                        }
                    }
                }

                if (matching){
                    length ++;
                }
            }
        }






        return strs[0].substring(0, length);
    }
}
