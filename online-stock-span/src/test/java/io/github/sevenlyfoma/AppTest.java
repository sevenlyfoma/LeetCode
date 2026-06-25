package io.github.sevenlyfoma;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        int[] inputs = {100, 80, 60, 70, 60, 75, 85};
        int[] outputs = new int[inputs.length];

        StockSpanner sp = new StockSpanner();

        for (int i = 0; i < inputs.length; i++){
            outputs[i] = sp.next(inputs[i]);
        }

        int[] expected = {1, 1, 1, 2, 1, 4, 6};

        assertArrayEquals(expected, outputs);
    }
}
