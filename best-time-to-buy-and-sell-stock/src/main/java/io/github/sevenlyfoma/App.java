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


        System.out.println( App.maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        if (prices.length == 0){
            return 0;
        }

        int maxProfit = 0;
        int minBuy = prices[0];

        for (int i = 1; i < prices.length; i++){
            int n = prices[i];

            int profit = n - minBuy;

            if (profit > maxProfit){
                maxProfit = profit;
            }

            if (n < minBuy){
                minBuy = n;
            }
        }

        return maxProfit;
    }
}