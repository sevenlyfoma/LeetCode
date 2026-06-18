package io.github.sevenlyfoma;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // System.out.println( "Hello World!" );

        int[] piles = {1,2,3,4,5};

        System.out.println(App.minEatingSpeed(piles, 8));
        System.out.println(App.minEatingSpeed(piles, 9));
        System.out.println(App.minEatingSpeed(piles, 12));
        System.out.println(App.minEatingSpeed(piles, 15));
    }

    public static int minEatingSpeed(int[] piles, int h) {
        //We want to eat in h increments
        //We want to use every hour
        //However we might not be able to
        //Take {1,2,3,4,5}
        //with k = 2 this takes 9 hours with k=1 this takes 15 hours
        //if 9 < h < 15 , the solution is k = 2 but the number of hours used will be less than the maximum allowed

        //Possible Solution Space
        int lb = 0;
        int max = 0;
        for (int x: piles){
            if (x > max){
                max = x;
            }
        }
        int ub = max;

        //Within the solution space there are numbers that are too low and too high
        //If they are too low, this is because they cannot consume all bananas within h hours
        //If they are too high, this is because the number of hours needed is less than another solution which uses more hours
        //Too high doesnt matter right now, we want to find the lowest solution that can do it within h hours
        //Such a lowest solution will always be the longest

        //Binary search for first success, add 1 = first success
        while (lb < ub){
            int mid = Math.floorDiv((ub + lb), 2);

            if (kWorks(piles, mid, h)){
                ub = mid;
            }
            else{
                lb = mid + 1;
            }
        }
    
        return (lb);
    }

    public static boolean kWorks(int[] piles, int k, int h){
        if (k == 0){
            return false;
        }

        int hoursSpent = 0;
        int i = piles.length - 1;
        
        while (hoursSpent < h && i >= 0){
            hoursSpent += Math.ceilDiv(piles[i], k);
            i--;
        }
        
        boolean ret = (i == -1 && hoursSpent <= h);

        return ret;
    }
}
