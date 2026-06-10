package io.github.sevenlyfoma;

import static org.junit.Assert.assertEquals;
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
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void sampleTest()
    {
        int[] inp = {1,2,3,4};
        assertEquals(2, App.maxOperations(inp, 5));
    }

    @Test
    public void sampleTest2()
    {
        int[] inp = {3,1,3,4,3};
        assertEquals(1, App.maxOperations(inp, 6));
    }

    @Test
    public void sampleTest3()
    {
        int[] inp = {1,2,3,5,4,3};
        assertEquals(3, App.maxOperations(inp, 6));
    }


    
}
