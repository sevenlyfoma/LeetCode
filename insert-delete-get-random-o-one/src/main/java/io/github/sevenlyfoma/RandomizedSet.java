package io.github.sevenlyfoma;

import java.util.ArrayList;
import java.util.HashMap;

class RandomizedSet {

    HashMap<Integer, Integer> hm;
    ArrayList<Integer> checker;

    int head = 0;
    int tail = 0;

    public RandomizedSet() {
        checker = new ArrayList<>();

        hm = new HashMap<>();
    }
    
    public boolean insert(int val) {

        if (hm.containsKey(val)){
            return false;
        }
        else {
            if (tail == 0){
                checker.add(val);

                hm.put(val, head);

                head++;
            }

            else{
                checker.set(tail-1, val);
                
                hm.put(val, tail-1);

                tail--;
            }
            

            

            return true;
        }

    }
    
    public boolean remove(int val) {
        if (hm.containsKey(val)){
            int position = hm.get(val);

            int front = checker.get(tail);

            checker.set(tail, val);
            checker.set(position, front);

            hm.put(front, position);

            hm.remove(val);

            tail++;

            return true;
        }
        else{
            return false;
        }
    }
    
    public int getRandom() {
        
        int index = (int) ((Math.random() * (head - tail)) + tail);


        return checker.get(index);
    }
}