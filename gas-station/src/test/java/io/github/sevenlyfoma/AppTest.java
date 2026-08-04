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
    public void sampleTest1()
    {
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};

        assertEquals(3, App.canCompleteCircuit(gas, cost));
    }
}
