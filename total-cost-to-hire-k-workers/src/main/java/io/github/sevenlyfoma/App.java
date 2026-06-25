package io.github.sevenlyfoma;

import java.util.PriorityQueue;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        int[] inp = {17,12,10,2,7,2,11,20,8};
        App.totalCost(inp, 3, 4);
    }

    
    public static long totalCost(int[] costs, int k, int candidates) {

        int workersSelected = 0;
        long totalCost = 0;

        int length = costs.length;

        int lp = 0;
        int rp = length-1;

        int lc = 0;
        int rc = 0;

        PriorityQueue<Integer> lpq = new PriorityQueue<>();
        PriorityQueue<Integer> rpq = new PriorityQueue<>();

        lpq.add(Integer.MAX_VALUE);
        rpq.add(Integer.MAX_VALUE);


        while (workersSelected < k){

            while (lp - lc < candidates && lp <= rp){
                lpq.add(costs[lp]);
                lp++;
            }

            while (length - 1 - rp - rc < candidates && lp <= rp){
                rpq.add(costs[rp]);
                rp--;
            }

            Integer lpeek = lpq.peek();
            Integer rpeek = rpq.peek();

            if (lpeek <= rpeek){
                lc++;
                totalCost += lpq.poll();
            }
            else {
                rc++;
                totalCost += rpq.poll();
            }

            

            

            workersSelected++;
        }

        

        return totalCost;
    }

    public record PlacedCost (int cost, boolean left){}

    public static int comparePC(PlacedCost a, PlacedCost b){
        int res = Integer.compare(a.cost, b.cost);

        if (res == 0){
            if (a.left && !b.left){
                return -1;
            }
            else if (!a.left && b.left){
                return 1;
            }
            else{
                return 0;
            }
        }
        return res;
    }


    public static long totalCostSlow(int[] costs, int k, int candidates) {

        int workersSelected = 0;
        long totalCost = 0;

        int length = costs.length;

        int lp = 0;
        int rp = length-1;

        int lc = 0;
        int rc = 0;

        PriorityQueue<PlacedCost> pq = new PriorityQueue<>(2*candidates, (a,b) -> comparePC(a, b));

        while (workersSelected < k){

            //left pointer right pointer both go inwards adding to priority queue, at each step take the smallest

            // System.out.println(lp);
            // System.out.println(rp);
            // System.out.println();
            while (lp - lc < candidates && lp <= rp){
                pq.add(new PlacedCost(costs[lp], true));
                lp++;
            }

            while (length - 1 - rp - rc < candidates && lp <= rp){
                pq.add(new PlacedCost(costs[rp], false));
                rp--;
            }

            // System.out.println(""+ Arrays.toString(costs));
            // System.out.println(pq);
            //workersSelected=k;

            PlacedCost pc = pq.poll();

            // System.out.println(pc.cost);

            if (pc.left){
                lc++;
            }
            else{
                rc++;
            }


            totalCost+=pc.cost;

            

            workersSelected++;
        }

        

        return totalCost;
    }
}
