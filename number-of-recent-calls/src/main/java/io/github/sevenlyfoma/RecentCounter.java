package io.github.sevenlyfoma;

import java.util.ArrayDeque;

public class RecentCounter {

    ArrayDeque<Integer> times;

    int subtractTime = 3000;

    public RecentCounter() {
        this.times = new ArrayDeque<>();       
    }
    
    public int ping(int t) {

        times.addLast(t);

        int minimumTime = t - subtractTime;

        while (times.getFirst() < minimumTime){
            times.removeFirst();
        }
        
        return times.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */