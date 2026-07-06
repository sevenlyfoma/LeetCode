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

        //7,1,5,3,6,4

        //7,1,2,2,1000

        int bankRollIfLastActionWasBuy = -prices[0];
        int bankRollIfLastActionWasSell = 0;

        
        for (int i = 1; i < prices.length; i++){
            int bankRolltAfterSelling = bankRollIfLastActionWasBuy + prices[i];
            int bankRollAfterBuying = bankRollIfLastActionWasSell - prices[i];

            
            if (bankRollAfterBuying > bankRollIfLastActionWasBuy){
                bankRollIfLastActionWasBuy = bankRollAfterBuying;
            }

            if (bankRolltAfterSelling > bankRollIfLastActionWasSell){
                bankRollIfLastActionWasSell = bankRolltAfterSelling;
            }

        }

        return bankRollIfLastActionWasSell;
    }
}