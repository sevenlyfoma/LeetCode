package io.github.sevenlyfoma;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<Integer> nums1without = new ArrayList<>();
        List<Integer> nums2without = new ArrayList<>();

        HashMap<Integer, Integer> tracker = new HashMap<>();

        for (int i = 0; i < nums1.length; i++){
            tracker.putIfAbsent(nums1[i], 1);
        }

         for (int i = 0; i < nums2.length; i++){
            int x = nums2[i];
            if (tracker.containsKey(x)){
                if (tracker.get(x) == 1){
                    tracker.put(x, 0);
                }
            }
            else{
                tracker.put(x, 2);
            }
            
        }

        for (Integer x: tracker.keySet()){
            if (tracker.get(x) == 1){
                nums1without.add(x);
            }
            else if (tracker.get(x) == 2){
                nums2without.add(x);
            }
        }
        

        List<List<Integer>> ret = new ArrayList<>();
        ret.add(nums1without);
        ret.add(nums2without);
        return ret;
    }
}
