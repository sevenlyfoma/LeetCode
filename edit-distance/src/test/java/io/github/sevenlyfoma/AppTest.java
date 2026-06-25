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
    public void sample1()
    {
        assertEquals(3, App.minDistance("horse", "ros"));
    }

    @Test
    public void sample2()
    {
        assertEquals(5, App.minDistance("intention", "execution"));
    }

    @Test
    public void sample3()
    {
        assertEquals(1, App.minDistance("aaaaxbbbb", "aaaabbbb"));
    }

     @Test
    public void oneSwapBetterThanDeleteInsert()
    {
        assertEquals(1, App.minDistance("aaaxbbbb", "aaaabbbb"));
    }

    @Test
    public void oneInsertOneDeleteIsBetterThanThreeSwaps()
    {
        assertEquals(2, App.minDistance("axaacbb", "aaacbbb"));
    }

    @Test
    public void sample4()
    {
        assertEquals(3, App.minDistance("mart", "karma"));
    }

     @Test
    public void sample5()
    {
        assertEquals(3, App.minDistance("park", "spake"));
    }

     @Test
    public void sample6()
    {
        assertEquals(3, App.minDistance("sea", "ate"));
    }

     @Test
    public void sample7()
    {
        assertEquals(3, App.minDistance("spartan", "part"));
    }

     @Test
    public void sample8()
    {
        assertEquals(6, App.minDistance("plasma", "altruism"));
    }

     @Test
    public void sample9()
    {
        assertEquals(7, App.minDistance("dinitrophenylhydrazine", "phenylhydrazine"));
    }

    
}
