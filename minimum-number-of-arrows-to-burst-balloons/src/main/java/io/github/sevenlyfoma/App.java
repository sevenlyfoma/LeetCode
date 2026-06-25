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
        int[][] input = {{3,9},{7,12},{3,8},{6,8},{9,10},{2,9},{0,9},{3,9},{0,6},{2,8}};
        System.out.println( App.findMinArrowShots(input));
    }

    public static int findMinArrowShots(int[][] points) {

        if (points.length == 0){
            return 0;
        }


        Arrays.sort(points, (x, y) -> Integer.compare(x[0], y[0]));

        // System.out.println(Arrays.deepToString(points));

        int arrows = 1;

        int[] curr = points[0];
        for (int i = 1; i < points.length; i++){
            int [] comp = points[i];

            //We need a new arrow case

            if (comp[0] > curr[1]){
                arrows++;
                curr = comp;
            }

            else{ 
                if (comp[1] < curr[1]){
                    curr = comp;
                }
            }
        }


        return arrows;
    }
}
