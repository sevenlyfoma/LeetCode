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

    public static int compress(char[] chars) {

        char comparison_char = chars[0];
        
        int running_length = 0;

        int recording_index = 0;

        for (int i = 0; i < chars.length; i++){
            char c = chars[i];
            chars[i] = 0;

            if (c == comparison_char){
                running_length += 1;
            }

            if (i == chars.length - 1 || chars[i+1] != comparison_char){
            
                chars[recording_index] = comparison_char;
                recording_index++;
                if (running_length != 1){
                    String strRunLength = Integer.toString(running_length);

                    for (int ci = 0; ci< strRunLength.length(); ci++){
                        chars[recording_index] = strRunLength.charAt(ci);
                        recording_index++;
                    }
                }

                if (i != chars.length - 1){
                    comparison_char = chars[i+1];
                    running_length = 0;
                }
                


            }

        }
        

        return recording_index;
    }

    
}
