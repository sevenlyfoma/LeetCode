package io.github.sevenlyfoma;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] nums1 = {1,3,3,2};
        int[] nums2 = {2,1,3,4};

        System.out.println(App.maxScore(nums1, nums2, 3));
    }

    public record Pair (int n1, int n2){}

    public static long maxScore(int[] nums1, int[] nums2, int k) {


        //First pair all the inputs up
        ArrayList<Pair> pairs = new ArrayList<>();

        for (int i = 0; i < nums2.length; i++){
            pairs.add(new Pair(nums1[i], nums2[i]));
        }

        long currentMax = Long.MIN_VALUE;

        //Make a priority queue sorted by largest nums1 value
        PriorityQueue<Pair> maxHeap = new PriorityQueue<>(k, (p1, p2) -> Integer.compare(p2.n1, p1.n1));

        //Add all pairs to it
        for (Pair p: pairs){
            maxHeap.add(p);
        }

        //Make a priority queue sorted by smalled nums 2 value
        PriorityQueue<Pair> minHeap = new PriorityQueue<>(k, (p1, p2) -> Integer.compare(p1.n2, p2.n2));

        long sum = 0;

        //Get the k-1 highest n1 values and sum them together, add the corresponding pairs to the min heap
        for (int i = 0; i < k - 1; i++){
            Pair p = maxHeap.poll();
            sum += p.n1;
            minHeap.add(p);
        }

        while (!maxHeap.isEmpty()){

            //Get the highest value of n1 from the maxHeap, giving us a total of k elements so we have a full subsequence
            Pair newP = maxHeap.poll();

            //Add this to the new sum
            sum += newP.n1;

            //Add this element to the min heap
            minHeap.add(newP);

            //From our subsequence, get the minimum value for n2
            //Since this is the largest possible subsequence of n1s for which n2 is the minimum, this will be the largest
            //Grand total this n2 can ever contribute to
            Pair lowestMult = minHeap.poll();

            //Find this total
            long subTotal = lowestMult.n2 * sum;

            //Check if its the new best
            if (subTotal > currentMax){
                currentMax = subTotal;
            }

            //Revert our sum to only include k-2 values
            sum -= lowestMult.n1;
        }
        
        return currentMax;
    }
}
