package io.github.sevenlyfoma;

import static org.junit.Assert.assertArrayEquals;
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
    public void simpleDoesInclude()
    {
        int[] inp = {1,2,3,4,5};
        assertEquals(true, App.increasingTriplet(inp));
    }

    @Test
    public void simpleDoesntInclude()
    {
        int[] inp = {5,4,3,2,1};
        assertEquals(false, App.increasingTriplet(inp));
    }

    @Test
    public void seperatedDoesInclude()
    {
        int[] inp = {1,5,2,3};
        assertEquals(true, App.increasingTriplet(inp));
    }

    @Test
    public void seperatedDoesInclude2()
    {
        int[] inp = {20,100,10,12,5,13};
        assertEquals(true, App.increasingTriplet(inp));
    }

    @Test
    public void findsTriple()
    {
        int[] inp = {20,100,10,12,5,13};
        int[] exp = {10,12,13};
        assertArrayEquals(exp, App.increasingTripletRes(inp));
    }

    @Test
    public void findsTripleStrange()
    {
        int[] inp = {1,5,2,0,3};
        int[] exp = {1,2,3};
        assertArrayEquals(exp, App.increasingTripletRes(inp));
    }
}
