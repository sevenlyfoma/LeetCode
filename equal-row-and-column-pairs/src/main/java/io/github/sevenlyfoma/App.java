package io.github.sevenlyfoma;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

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

    public static int equalPairs(int[][] grid) {

        HashMap<List<Integer>, Integer> rowRecord = new HashMap<>();

        for (int[] x : grid) {
            List<Integer> hc = Arrays.stream(x).boxed().collect(Collectors.toList());


            rowRecord.putIfAbsent(hc, 0);
            rowRecord.put(hc, rowRecord.get(hc)+1);
        }

        int[] column = new int[grid.length];

        int total = 0;

        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid.length; j++){
                column[j] = grid[j][i];
            }
            List<Integer> hc = Arrays.stream(column).boxed().collect(Collectors.toList());

            total += rowRecord.getOrDefault(hc, 0);

        }
            

        return total;
    }


}
