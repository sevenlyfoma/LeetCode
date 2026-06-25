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

    public static void moveZeroes(int[] nums) {
        
        int currentNumberOfZeroes = 0;

        for(int i = 0; i < nums.length; i++){
            int x = nums[i];

            if (x == 0){
                currentNumberOfZeroes += 1;
            }
            else {
                if (currentNumberOfZeroes > 0){
                    nums[i-currentNumberOfZeroes] = nums[i];
                }
            }

        }

        for (int i = nums.length - currentNumberOfZeroes; i < nums.length; i ++){
            nums[i] = 0;
        }
    }
}
