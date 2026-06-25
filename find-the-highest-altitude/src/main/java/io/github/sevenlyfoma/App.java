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

    public static int largestAltitude(int[] gain) {

        int highest = 0;
        int currentHeight = 0;

        for (int i = 0; i < gain.length; i++){
            currentHeight += gain[i];

            if (currentHeight > highest){
                highest = currentHeight;
            }
        }
        
        return highest;
    }
}
