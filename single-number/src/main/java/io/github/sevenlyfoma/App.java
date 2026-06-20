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

    public static int singleNumber(int[] nums) {
        int runner = nums[0];

        for (int i = 1; i < nums.length; i++){
            int n = nums[i];

            runner = runner ^ n;
        
        }

        return runner;
    }
}
