package io.github.sevenlyfoma;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // int[][] intervals = {{0,2},{1,3},{1,3},{2,4},{3,5},{3,5},{4,6}};

        int[][] intervals = {{1,100},{11,22},{1,11},{2,12}};

        System.out.println(eraseOverlapIntervals(intervals));
    }

    public static int eraseOverlapIntervals(int[][] intervals) {

        List<List<Integer>> si = new ArrayList<>();

        for (int[] x: intervals){
            List<Integer> inner = new ArrayList<>();
            inner.add(x[0]);
            inner.add(x[1]);
            si.add(inner);
        }

        si.sort((x, y) -> Integer.compare(x.get(0), y.get(0)));

        System.out.println(si);

        List<Integer> last = si.get(0);

        int deletions = 0;
        for (int i = 1; i < si.size(); i++){
            List<Integer> next = si.get(i);

            int x0 = last.get(0);
            int y0 = last.get(1);
            int x1 = next.get(0);
            int y1 = next.get(1);

            if ((x0 == x1 && y0 == y1)
             || (x1 > x0 && x1 < y0)
             || (y0 > x1 && y0 < y1)
             || (y1 > x0 && y1 < y0)
             || (x0 > x1 && x1 < y1)
            ){
                
                // System.out.println(last);
                // System.out.println(next);
                // System.out.println("");
                deletions++;

                if (Math.abs(y0 - x0) > Math.abs(y1 - x1)){
                    last = next;
                }

                
            }
            else{
                last = next;
            }
        }

        return deletions;
    }
}
