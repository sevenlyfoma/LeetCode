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
        int[] nums = {3,2,3,1,2,4,5,5,6};

        findKthLargest(nums, 4);
    }

    public static int findKthLargest(int[] nums, int k) {
        //Priority queue is based on the heap data structure
        //Tree based datastructure which only acesses the smallest or biggest element
        //Default smallest, would need a custom comparator for biggest
        PriorityQueue<Integer> pq = new PriorityQueue<>(k+1);

        for (int x: nums){
            pq.add(x);

            if (pq.size() > k){
                pq.remove();
            }

        }


        return pq.poll();
    }
}
