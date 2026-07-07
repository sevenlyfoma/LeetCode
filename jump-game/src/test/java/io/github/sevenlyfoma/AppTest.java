package io.github.sevenlyfoma;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
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
        int[] input ={2,3,1,1,4};
        assertTrue( App.canJump(input));
    }

    @Test
    public void sampleTest2()
    {
        int[] input ={3,2,1,0,5};
        assertFalse( App.canJump(input));
    }
}
