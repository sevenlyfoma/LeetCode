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

    public static int numTilings(int n) {
        int[] dp = new int[n];

        if (n >= 1){
            dp[0] = 1;
        }
        if (n >= 2){
            dp[1] = 2;
        }
        if (n >= 3){
            dp[2] = 5;
        }

        for (int i = 3; i < n; i++){
            dp[i] = ( ((dp[i-1] * 2) % 1000000007) + dp[i-3] ) % 1000000007; 
        }


        return dp[n-1];
    }
}
