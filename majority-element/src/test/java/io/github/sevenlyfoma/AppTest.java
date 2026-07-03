package io.github.sevenlyfoma;

import static org.junit.Assert.assertEquals;
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
    public void sampletest1()
    {

        int[] input = {2,2,1,1,1,2,2};
        assertEquals(2, App.majorityElement(input));
    }
}
