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

    public static int removeDuplicates(int[] nums) {
        int offset = 0;

        int current = 0;

        for (int i = 0; i < nums.length; i++){
            int x = nums[i];

            if (i == 0){
                current = x;
            }
            else if (current == x){
                offset ++;
            }
            else{
                current = x;
                nums[i-offset] = x;
            }
            
        }

        return nums.length - offset;
    }
}
