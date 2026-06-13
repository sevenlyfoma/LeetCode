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

    public static int maxArea(int[] height) {
        
        int lp = 0;
        int rp = height.length-1;

        int maxVolume = 0;
        int nv;

        while (lp < rp){
            int y1 = height[lp];
            int y2 = height[rp];

            int x = rp-lp;

            if (y1 <= y2){
                nv = y1 * x;
                lp++;
            }
            else {
                nv = y2 * x;
                rp--;
            }

            if (nv > maxVolume){
                maxVolume = nv;
            }
        }

        return maxVolume;
    }

    /**
     * Imagine input:
     * [1, a, b, c, d, 100]
     * when we move the pointers left or right we eliminate all possible pairs of the previous pointer value
     * So if we start l=n(0)=1 and r=n(length-1)=100
     * When we move r left, the ONLY solutions we elinate are
     * a,100 b,100 c,100 d,100
     * Equally when we move l right, the ONLY solutions we eliminate are 
     * 1,d, 1,c 1,b 1,a
     * since 1<100 and a, b, c, d all result in a lower width
     * It is always SAFE to eliminate 1,d 1,c 1,b and 1,a since they will always be smaller than 1,100
     * this is not true for 100,a 100,b etc, which MIGHT be larger than 1,100
     * So AS LONG as we measure 1,100 and keep running track of the next largest, we are safe to eliminate all 1,x answers and move on
     * 
     * 
     * What if we have
     * [100, a, b, c, 100]
     * Then both (100,a 100,b and 100,c) and (a,100 b,100 and c,100) are always smaller than 100,100
     * SO IT IS SAFE TO ELIMINATE EITHER ONE
     */
}
