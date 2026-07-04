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
    public void sampleTest1()
    {
        int[] input = {1,2,3,4,5,6,7};
        int k = 3;

        App.rotate(input, k);

        int[] expectec = {5,6,7,1,2,3,4};

        assertArrayEquals(expectec, input);
    }
}
