package io.github.sevenlyfoma;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};

        canCompleteCircuit(gas, cost);
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;

        // 0, 1, 2, 3, 4  .. n = 5
        // 0, 1, 2, 3 m = 4

        boolean solutionFound = false;
        int i = 0;

        int successfulLength = 0;

        int currentGas = 0;

        int currentStartingPoint = 0;

        while (i < ((n*2) - 1) && !solutionFound){

            // System.out.println("l1");
            
            int position = i % n;

            if (currentStartingPoint == position){
                currentGas = 0;
            }

            currentGas += gas[position];

            int currentCost = cost[position];

            // System.out.println("");
            // System.out.println(position);
            // System.out.println(currentGas);
            // System.out.println(currentCost);
            // System.out.println("");


            while (currentStartingPoint != position && currentCost > currentGas){
                // System.out.println("l2");
                currentGas = currentGas - gas[currentStartingPoint] + cost[currentStartingPoint];
                successfulLength --;
                currentStartingPoint++;
                currentStartingPoint = currentStartingPoint % n;
            }

            if (currentCost <= currentGas){
                successfulLength++;
                currentGas -= currentCost;
            }
            else{
                currentStartingPoint++;
                currentStartingPoint = currentStartingPoint % n;
            }


            if (successfulLength == n){
                solutionFound = true;
            }



            // System.out.println(successfulLength);
            i++;
        }

        // for (int i = 0; i < ((n*2) - 1); i++){

        
        // }

        if (!solutionFound){
            return -1;
        }


        return currentStartingPoint;
    }

    public static int canCompleteCircuitQuadratic(int[] gas, int[] cost) {


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
