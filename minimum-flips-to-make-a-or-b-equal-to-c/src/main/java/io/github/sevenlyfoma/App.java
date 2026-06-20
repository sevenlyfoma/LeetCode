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

    public static int minFlips(int a, int b, int c) {

        //a & b exposes the number of flips needed in both a and b
        //a ^ b exposes the number of flips needed in only one of a and b
        
        int count = 0;

        int max = Math.max(Math.max(a,b),c);

        for (int i = 1; i <= max; i *= 2){

            int cSingleBit = c & i;
            int aSingleBit = a & i;
            int bSingleBit = b & i;

            if (cSingleBit == i && aSingleBit == 0 && bSingleBit == 0){
                count += 1;
            }
            else if (cSingleBit == 0){
                if (aSingleBit == i){
                    count++;
                }
                if (bSingleBit == i){
                    count++;
                }
            }


        }
        

        return count;
    }
}



            //c = 1
            //anded = 1
            //xor = 0
            //or = 1
            //No bits need to be changed

            //c = 1
            //anded = 0
            //xor = 1
            //or = 1
            //No bits need to be changed

            //c = 1
            //anded = 0
            //xor = 0
            //or = 0
            //1 bit needs to be changed

            //c = 0
            //anded = 1
            //xor = 0
            //or = 1
            //2 bites need to be changed

            //c = 0
            //anded = 0
            //xor = 1
            //or = 1
            //1 bits need to be changed

            //c = 0
            //anded = 0
            //xor = 0
            //or = 0
            //no bit needs to be changed