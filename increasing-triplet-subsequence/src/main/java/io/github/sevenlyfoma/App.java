package io.github.sevenlyfoma;

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


    public static int[] increasingTripletRes(int[] nums) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        int[] result = {0,0,0};

        for (int i = 0; i < nums.length; i++){
            int x = nums[i];
            if (x <= min1){
                min1 = x;
            }
            else if (x <= min2){
                min2 = x;
                result[0] = min1;
                result[1]= min2;
            }
            else{
                result[2] = x;
                return result;
            }
        }

        return null;
    }

    public static boolean increasingTriplet(int[] nums) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++){
            int x = nums[i];
            if (x <= min1){
                min1 = x;
            }
            else if (x <= min2){
                min2 = x;
            }
            else{
                return true;
            }
        }

        return false;
    }


    //Uses a O(n^3) algorithm, too slow to pass test cases
    public static boolean increasingTripletCubic(int[] nums) {
        if (nums.length < 3){
            return false;
        }

        boolean notFound = true;

        int i = 0;
        while (i < nums.length - 2 && notFound){
            int j = i + 1;

            while (j < nums.length - 1 && notFound){

                if (nums[j] > nums[i]){
                    int k = j + 1;

                    while (k < nums.length && notFound){
                        if (nums[k] > nums[j]){
                            notFound = false;
                        }
                        k++;

                    }


                }

                j++;


            }
            i++;

        }

        return !notFound;
    }
}
