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
        int[] spells = {5,1,3};
        int[] potions = {1,2,3,4,5};
        long success = 7;
        int[] exp = {4,0,3};

        assertArrayEquals(exp, App.successfulPairs(spells, potions, success));
    }

}
