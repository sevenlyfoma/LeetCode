package io.github.sevenlyfoma;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] inp = {1, 2, 3, 0, 0};
        printArray(productExceptSelf(inp));
    }

    public static void printArray(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            System.out.print(",");
        }
        System.out.print("\n");
    }

    public static int[] productExceptSelf(int[] nums) {

        int productWithoutZero = 1;

        int numberOfZeros = 0;

        int l = nums.length;

        for (int i = 0; i < l; i++) {
            int n = nums[i];
            if (n != 0){
                productWithoutZero *= n;
            }
            else{
                numberOfZeros++;
            }
        }

        if (numberOfZeros > 1){
            for (int i = 0; i < l; i++) {
                nums[i] = 0;

                
            }
            return nums;
        }

        else if (numberOfZeros == 1){
            for (int i = 0; i < l; i++) {
                if (nums[i] == 0) {
                    nums[i] = productWithoutZero;
                }
                else {
                    nums[i] = 0;
                }
            }
            return nums;
        }

        else {
            for (int i = 0; i < l; i++) {
                nums[i] = productWithoutZero / nums[i];
            }
            return nums;
        }
    }
}
