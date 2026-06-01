package io.sevenlyfoma.github;

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

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        //We want to count the number of stretchs of zeros and their lengths
        //A stretch of 3 zeros means 1 placeable, 5 means 2, 7 means 3 etc
        //2 3s mean 2 etc. 
        // We can probably do this in one iteration

        int currentStretchLength = 1;

        int remainingFlowersToPlace = n;

        int i = 0;
        while (i < flowerbed.length && remainingFlowersToPlace != 0) {

            if (flowerbed[i] == 1){
                currentStretchLength = 0;
            }

            else{
                currentStretchLength += 1;

                if (currentStretchLength % 2 == 1 && currentStretchLength != 1){
                    remainingFlowersToPlace -= 1;
                    currentStretchLength = 1;
                }
            }

            i++;

        }

        if (currentStretchLength == 2 && remainingFlowersToPlace == 1){
            remainingFlowersToPlace = 0;
        }



        return (remainingFlowersToPlace == 0);
    }
}
