package io.github.sevenlyfoma;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // int[] exp = {0,1,1,2,1,2,2,3,1}};
        System.out.println(Arrays.toString(App.countBits(8)));
    }

    public static int[] countBits(int n) {
        int[] ans = new int[n+1];
        
        ans[0] = 0;
        if (n >= 1){
            ans[1] = 1;
        }
        

        int power = 2;

        int count = 2;

        for (int i = 2; i < n+1; i++){

            // System.out.println(i);

            ans[i] = 1 + ans[i-power];


            count--;
            if (count == 0){
                power*=2;
                count = power;    
            }
        }


        return ans;
    }
}
