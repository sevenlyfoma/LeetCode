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

    public static int findPeakElement(int[] nums) {
        int lb = 0;
        int ub = nums.length;

        int foundAt = -1;

        while (foundAt == -1){
            int mid = (lb + ub) /2;

            int midNum = nums[mid];

            boolean greaterThanLeft = false;

            if (mid - 1 < 0){
                greaterThanLeft = true;
            }
            else{
                if (midNum > nums[mid-1]){
                    greaterThanLeft = true;
                }
            }

            boolean greaterThanRight = false;

            if (mid + 1 >= nums.length){
                greaterThanRight = true;
            }
            else{
                if (midNum > nums[mid+1]){
                    greaterThanRight = true;
                }
            }

            if (greaterThanLeft && greaterThanRight){
                foundAt = mid;
            }

            if (!greaterThanLeft && mid - 1 >= 0){
                ub = mid - 1;
            }
            else{
                lb = mid + 1;
            }




        }



        return foundAt;
    }
}
