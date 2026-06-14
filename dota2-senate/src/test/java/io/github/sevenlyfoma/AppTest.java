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
    public void sampleTest1()
    {
        assertEquals("Radiant", App.predictPartyVictory("RD"));
    }

    @Test
    public void sampleTest2()
    {
        assertEquals("Dire", App.predictPartyVictory("RDD"));
    }

    @Test
    public void lateWinners()
    {
        assertEquals("Dire", App.predictPartyVictory("RRRRRRDDDDDDDDDDD"));
    }

     @Test
    public void sampleTest4()
    {
        assertEquals("Dire", App.predictPartyVictory("DDRRR"));
    }
}
