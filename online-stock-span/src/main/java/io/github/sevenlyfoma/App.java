package io.github.sevenlyfoma;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] inputs = {100, 80, 60, 70, 60, 75, 85};
        int[] outputs = new int[inputs.length];

        StockSpanner sp = new StockSpanner();

        for (int i = 0; i < inputs.length; i++){
            outputs[i] = sp.next(inputs[i]);
        }

        System.out.println("" + Arrays.toString(outputs));
    }
}
