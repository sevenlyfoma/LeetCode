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

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int p1 = 0;

        int p2 = 0;

        int i = 0;

        int[] temp = new int[m];
        
        System.arraycopy(nums1, 0, temp, 0, m);

        while (p1 != m || p2 != n){
            if (p1 == m){
                nums1[i] = nums2[p2];
                p2++;
            }
            else if (p2 == n){
                nums1[i] = temp[p1];
                p1++;
            }
            else {
                int x = temp[p1];
                int y = nums2[p2];
                if (x <= y){
                    nums1[i] = x;
                    p1++;
                }
                else{
                    nums1[i] = y;
                    p2++;
                }
            }

            


            i++;
        }
    }
}
