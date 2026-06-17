package io.github.sevenlyfoma;

import java.util.PriorityQueue;

class SmallestInfiniteSet {

    PriorityQueue<Integer> pq;

    int front = 1;

    public SmallestInfiniteSet() {
        pq = new PriorityQueue<>();
    }
    
    public int popSmallest() {
        int res;
        if (pq.isEmpty()){
            res = front;
            front ++;
        }
        else{
            res = pq.poll();
        }
        
        return res;
    }
    
    public void addBack(int num) {
        if (num < front){
            if (!pq.contains(num)){
                pq.add(num);
            }
        }
    }
}