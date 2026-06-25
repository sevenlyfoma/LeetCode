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
    }

    public static int[] successfulPairs(int[] spells, int[] potions, long success) {

        Arrays.sort(potions);

        for (int i = 0; i < spells.length; i++){
            int spellStrength = spells[i];

            spells[i] = binarySearch(potions, 0, potions.length-1, success, spellStrength);
        }
     
        
        return spells;
    }

    public static int binarySearch(int[] potions, int lB, int uB, long searchTerm, long multiplier){
        int lb = 0;
        int ub = potions.length -1;

        if (((long) potions[0] )* multiplier >= searchTerm){
            return potions.length;
        }

        while (lb < ub){
            int mid = Math.ceilDiv((lb + ub), 2);

            if (((long) potions[mid] )*multiplier >= searchTerm){
                ub = mid - 1;
            }
            else{
                lb = mid;
            }

        }

        return (potions.length - 1 - lb);
    }
}
