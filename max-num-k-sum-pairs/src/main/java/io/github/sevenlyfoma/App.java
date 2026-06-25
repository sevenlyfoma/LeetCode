package io.github.sevenlyfoma;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] inp = {3,1,3,4,3};
        System.out.println(App.maxOperations(inp, 6));
    }

    public static int maxOperations(int[] nums, int k) {
        int totalNum = 0;

        Arrays.sort(nums);

        int lp = 0;
        int rp = nums.length-1;

        while (lp < rp){

            int sum = nums[lp] + nums[rp];

            if (sum == k){
                totalNum++;
                lp++;
                rp--;
            }
            else if (sum > k){
                rp--;
            }
            else{
                lp++;
            }


        }


        return totalNum;
    }

    public static int maxOperationsHashMap(int[] nums, int k) {
        HashMap<Integer, Integer> counts = new HashMap<>();


        for (int i = 0; i < nums.length; i++){
            int x = nums[i];

            counts.putIfAbsent(x, 0);
            counts.put(x, counts.get(x) +1);
        }

        int totalNum = 0;

        // System.out.println(counts.toString());

        for (Integer key: counts.keySet()){
            int value = counts.get(key);

            if (key != k- key){
                Integer oppositeValue = counts.get(k-key);

                if (oppositeValue != null){
                    totalNum += Math.min(value, oppositeValue);

                    counts.put(k-key, 0);
                }
            }
            else{
                totalNum += value/2;
            }
            

            


        }


        return totalNum;
    }

    public static int maxOperationsQuadratic2(int[] nums, int k) {

        int numFound = 0;

        int bp = 0;

        for (int i = 1; i < nums.length; i ++){
            int x = nums[i];
            
            boolean found = false;

            int j = bp;

            while (j < i && !found){
                int y = nums[j];
                
                if (x+y == k){
                    found = true;
                    numFound++;

                    nums[j] = nums[bp];
                    nums[i] = nums[bp+1];

                    bp+=2;


                }

                j++;
            }

        }

        return numFound;
    }

    public static int maxOperationsQuadratic(int[] nums, int k) {

        int numFound = 0;

        for (int i = 0; i < nums.length; i++){
            int x = nums[i];

            if (x != 0){
                int j = i + 1;

                boolean found = false;

                while (j < nums.length && !found){
                    int y = nums[j];

                    if (x+y == k && y != 0){
                        found = true;
                        numFound++;
                        nums[j] = 0;
                    }

                    j++;
                }
            }

            

        }    
    
        return numFound;
    }
}
