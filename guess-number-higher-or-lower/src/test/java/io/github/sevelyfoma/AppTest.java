package io.github.sevelyfoma;

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
        App a = new App(6);

        assertEquals(6, a.guessNumber(10));
    }

    @Test
    public void sampleTest2()
    {
        App a = new App(5);

        assertEquals(5, a.guessNumber(10));
    }

    @Test
    public void sampleTest3()
    {
        App a = new App(3);

        assertEquals(3, a.guessNumber(11));
    }

    @Test
    public void sampleTest4()
    {
        App a = new App(2);

        assertEquals(2, a.guessNumber(11));
    }

    @Test
    public void sampleTest5()
    {
        App a = new App(1);

        assertEquals(1, a.guessNumber(1));
    }

    @Test
    public void sampleTest6()
    {
        App a = new App(1);

        assertEquals(1, a.guessNumber(2));
    }

    @Test
    public void sampleTest7()
    {
        App a = new App(2);

        assertEquals(2, a.guessNumber(2));
    }

    @Test
    public void sampleTest8()
    {
        App a = new App(1702766719);
        assertEquals(1702766719, a.guessNumber(2126753390));
    }
}