package io.github.sevenlyfoma;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] inp = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        System.out.println(App.longestOnes(inp, 3));
    }

    public static int longestOnes(int[] nums, int k) {

        int frontOfWindow = 0;
        int runningLongest = 0;
        int maxLongest = 0;

        int nFlippedZeroes = 0;

        for (int i = 0; i < nums.length; i++){
            
            int x = nums[i];

            if (x==1){
                runningLongest++;
            }
            else{
                if (nFlippedZeroes < k){
                    nFlippedZeroes ++;
                    runningLongest ++;
                }
                else{
                    int j = frontOfWindow;
                    boolean zeroFound = false;

                    while (!zeroFound && j <= i){
                        if (nums[j] == 0){
                            runningLongest = i - j;
                            frontOfWindow = j + 1;
                            zeroFound = true;
                        }

                        j++;
                    }


                }
            }






            if (runningLongest > maxLongest){
                maxLongest = runningLongest;
            }
        }

        if (runningLongest > maxLongest){
            maxLongest = runningLongest;
        }

        // System.out.println(frontOfWindow);


        return maxLongest; 
    }

    public static int longestOnesVerySlow(int[] nums, int k) {
        

        int runningLongest = 0;
        int maxLongest = 0;

        int flippedZeroes = 0;

        int previousZeroPosition = -1;

        for (int i = 0; i < nums.length; i++) {

            int x = nums[i];

            if (x==1){
                runningLongest++;
            }
            else{
                if (previousZeroPosition == -1){
                    nums[i] = -1;
                    previousZeroPosition = i;
                }
                else{
                    nums[i] = previousZeroPosition;
                    previousZeroPosition = i;
                }

                if (flippedZeroes < k){
                    flippedZeroes ++;
                    runningLongest ++;
                }
                else {
                    // runningLongest ++;

                    int totalDistanceToFirstZero = 0;
                    boolean firsttZeroFound = false;

                    int currentZeroPosition = previousZeroPosition;
                    int secondToLastZeroPosition = -1;

                    int count = 0;

                    while (!firsttZeroFound && count <= k){
                        int currentZero = nums[currentZeroPosition];

                        if (currentZero == -1){
                            totalDistanceToFirstZero = i - currentZeroPosition;
                            firsttZeroFound = true;
                            if (secondToLastZeroPosition != -1){
                                nums[secondToLastZeroPosition]= -1;
                            }
                            
                        }
                        else{
                            secondToLastZeroPosition = currentZeroPosition;
                            currentZeroPosition = currentZero;
                        }
                        count++;

                    }

                    runningLongest = totalDistanceToFirstZero;



                }
            }



            if (runningLongest > maxLongest){
                maxLongest = runningLongest;
            }
        }



        if (runningLongest > maxLongest){
            maxLongest = runningLongest;
        }


        return maxLongest;
    }
}
