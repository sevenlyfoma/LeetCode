package io.sevenlyfoma.github;

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
    public void threeSpacesOnePlace()
    {
        int[] inp = {1, 0, 0, 0, 1};
        assertEquals(true, App.canPlaceFlowers(inp, 1));
    }

    @Test
    public void threeSpacesTwoPlace()
    {
        int[] inp = {1, 0, 0, 0, 1};
        assertEquals(false, App.canPlaceFlowers(inp, 2));
    }

    @Test
    public void threeSpacesZeroPlace()
    {
        int[] inp = {1, 0, 0, 0, 1};
        assertEquals(true, App.canPlaceFlowers(inp, 0));
    }

    @Test
    public void fiveSpacesOnePlace()
    {
        int[] inp = {1, 0, 0, 0, 0, 0, 1};
        assertEquals(true, App.canPlaceFlowers(inp, 1));
    }

    @Test
    public void fiveSpacesTwoPlace()
    {
        int[] inp = {1, 0, 0, 0, 0, 0, 1};
        assertEquals(true, App.canPlaceFlowers(inp, 2));
    }

    @Test
    public void fiveSpacesThrePlace()
    {
        int[] inp = {1, 0, 0, 0, 0, 0, 1};
        assertEquals(false, App.canPlaceFlowers(inp, 3));
    }

    @Test
    public void twothreeSpacesTwoPlace()
    {
        int[] inp = {1, 0, 0, 0, 1, 0, 0, 0, 1};
        assertEquals(true, App.canPlaceFlowers(inp, 2));
    }

    
    @Test
    public void twothreeSpacesThreePlace()
    {
        int[] inp = {1, 0, 0, 0, 1, 0, 0, 0, 1};
        assertEquals(false, App.canPlaceFlowers(inp, 3));
    }

    @Test
    public void startEmpty()
    {
        int[] inp = {0, 0, 1};
        assertEquals(true, App.canPlaceFlowers(inp, 1));
    }

    @Test
    public void endEmpty()
    {
        int[] inp = {1, 0, 0};
        assertEquals(true, App.canPlaceFlowers(inp, 1));
    }

    @Test
    public void endEmptyLong()
    {
        int[] inp = {1, 0, 0, 0, 0};
        assertEquals(true, App.canPlaceFlowers(inp, 2));
    }
}
