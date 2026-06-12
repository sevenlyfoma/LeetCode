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

    public static int longestSubarray(int[] nums) {

        int maxCount = 0;
        int runningCount = 0;

        int currentDeletion = -1;

        for (int i = 0; i < nums.length; i++){
            int x = nums[i];

            if (x == 1){
                runningCount ++;
            }

            else{

                
                if (currentDeletion != -1){
                    runningCount = i - currentDeletion - 1;
                }

                currentDeletion = i;


            }




            if (runningCount > maxCount){
                maxCount = runningCount;
            }
        }

        if (currentDeletion == -1){
            maxCount--;
        }



        return maxCount;
    }
}
