package io.github.sevelyfoma;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        App a = new App(1);
        System.out.println(a.guessNumber(2));
    }

    private final int guessNo;

    public App(int g){
        guessNo = g;
    }

    public int guess(int num){
        if (num > guessNo){
            return -1;
        }
        else if (num < guessNo){
            return 1;
        }
        return 0;
    }

    public int guessNumber(int n) {

        int lowerBound = 1;
        int upperBound = n;

        int currentGuess = (n/2);

        boolean found = false;

        while (!found){
            int res = guess(currentGuess);

            if (res == 0){
                found = true;
            }
            else{
                if (res == 1){
                    lowerBound = currentGuess+1;
                }
                else {
                    upperBound = currentGuess-1;
                }

                currentGuess = (int) (((long) lowerBound + (long) upperBound)/2);
        
            }
        }

        return currentGuess;
    }
}
