package io.github.sevenlyfoma;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        int[] prices ={1,3,7,5,10,3};
        int fee = 3;


        System.out.println( App.maxProfit(prices, fee));
    }

    // public static void printArraySlow(int[][] arr){
    //     int i = 0;
    //     for (int[] x: arr){
    //         System.out.print(i + ":");
    //         for (int y: x){
    //             if (y >= 0) System.out.print("+");
    //             System.out.print(y);
    //             System.out.print(" ");
    //         }
    //         System.out.println();
    //         i++;
    //     }
    //     System.out.println();
    // }

    public static int index = 1;

    public static void printArray(int[] arr){
        System.out.print(index+": ");
        for (int y: arr){
            
            if (y >= 0) System.out.print("+");
            System.out.print(y);
            System.out.print(" ");
        }
        index++;
        System.out.println();
    }

    //Could try making two dp[]s //Once for most if im holding, one for most if ive sold
    public static int maxProfit(int[] prices, int fee) {
        int s0 = 0;
        int s1 = Integer.MIN_VALUE;

        for (int p: prices){
            int tmp = s0;

            s0 = Math.max(s0, s1+p);
            s1 = Math.max(s1, tmp-p-fee);

        }
        return s0;
    }

    public static int maxProfitSlow2(int[] prices, int fee) {
        int n = prices.length;

        int[] dp = new int[n];

        int[] highestBankRoll = new int[n];

        for (int i = 0; i < n; i++){
            int bankRoll = 0;
            for (int j = i; j < n; j++){

                
                
                if (i == j){
                    if (j != 0){
                        // bankRoll += dp[j-1];
                        bankRoll += highestBankRoll[j-1];
                    }
                    bankRoll -= prices[j];
                    dp[j] = bankRoll;
                    
                }
                int bestsale;
                if (j > i){
                    int prev = dp[j-1];

                    // if (j == 1){
                    //     System.out.println("here");
                    // }


                    bestsale =  prices[j] + bankRoll - fee;
                    
                    if (prev > bestsale){
                        bestsale = prev;
                    }

                    dp[j] = bestsale;
                }

                if (dp[j] > highestBankRoll[j]){
                    highestBankRoll[j] = dp[j];
                }

                if (i!= 0){
                    int upper = highestBankRoll[j];
                    if (upper > dp[j]) {
                        dp[j]= highestBankRoll[j]; 
                    }
                }

                // printArray(dp);
            }
        }

        int res = dp[n-1];
        if (res < 0) res = 0;
        return res;
    }

    public static int maxProfitSlow(int[] prices, int fee) {
        int n = prices.length;

        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++){
            int bankRoll = 0;
            for (int j = 0; j < n; j++){
                
                if (i == j){
                    if (j != 0){
                        bankRoll += dp[i][j-1];
                    }
                    bankRoll -= prices[j];
                    dp[i][j] = bankRoll;
                    
                }
                int bestsale;
                if (j > i){
                    int prev = dp[i][j-1];


                    bestsale =  prices[j] + bankRoll - fee;
                    
                    if (prev > bestsale){
                        bestsale = prev;
                    }

                    dp[i][j] = bestsale;
                }

                if (i!= 0){
                    int upper = dp[i-1][j];
                    if (upper > dp[i][j]) {
                        dp[i][j]= dp[i-1][j]; 
                    }
                }

                // printArraySlow(dp);
            }
        }


        return dp[n-1][n-1];
    }
}
