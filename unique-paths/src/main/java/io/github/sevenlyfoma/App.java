package io.github.sevenlyfoma;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        int m = 3;
        int n = 7;
        System.out.println(App.uniquePaths(m, n));
    }

    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        for (int x = 0; x < n; x++){
            for (int y = 0; y < m; y++){
                if (x == 0 || y == 0){
                    dp[y][x] = 1;
                }
                else{
                    dp[y][x] = dp[y-1][x] + dp[y][x - 1];
                }
            }
        }

        return dp[m-1][n-1];
    }
}
