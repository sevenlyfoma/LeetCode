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

        int seen = 0;

        for (int i = 0; i < nums.length; i++){
            int x = nums[i];

            if (i == 0){
                current = x;
            }
            else if (current == x){
                seen++;
                if (seen > 1){
                    offset ++;
                }
                else {
                    nums[i-offset] = x;
                }
            }
            else{
                current = x;
                nums[i-offset] = x;
                seen = 0;
            }
            
        }

        return nums.length - offset;

    }
}
