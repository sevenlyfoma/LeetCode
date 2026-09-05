package io.github.sevenlyfoma;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {


        int n = gas.length;

        int ret = -1;

        for (int i = 0; i < n; i++){
            int currentGas = 0;

            boolean canDoIt = true;

            for (int j = 0; j < n; j++){

                int currentPos = (i + j) % n;
                currentGas += gas[currentPos];
                int currentCost = cost[currentPos];

                if (currentCost > currentGas){
                    canDoIt = false;
                }
                else{
                    currentGas -= currentCost;
                }


            }

            if (canDoIt){
                ret = i;
            }




        }



        return ret;
    }
}
