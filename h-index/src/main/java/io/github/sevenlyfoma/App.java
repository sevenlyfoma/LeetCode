package io.github.sevenlyfoma;

import java.util.Arrays;

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

    public static int hIndex(int[] citations) {

        Arrays.sort(citations);

        int h = 0;

        boolean hFound = false;
        
        int i = 0;

        while (i < citations.length && !hFound){
            int c = citations[i];

            if (c >= citations.length - i){
                hFound = true;
                h = citations.length - i;
            }

            i++;
        }



        return h;
    }
}
