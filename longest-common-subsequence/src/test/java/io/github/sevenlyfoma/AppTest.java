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
        String text1 = "abcde";
        String text2 = "ace" ;
        int expected = 3;

        assertEquals(expected, App.longestCommonSubsequence(text1, text2));
    }

    @Test
    public void sampleTest2()
    {
        String text1 = "aaaa";
        String text2 = "a" ;
        int expected = 1;

        assertEquals(expected, App.longestCommonSubsequence(text1, text2));
    }

     @Test
    public void sampleTest3()
    {
        String text1 = "abcab";
        String text2 = "aebc" ;
        int expected = 3;

        assertEquals(expected, App.longestCommonSubsequence(text1, text2));
    }

     @Test
    public void sampleTest4()
    {
        String text1 = "oxcpqrsvwf";
        String text2 =  "shmtulqrypy";
        int expected = 2;

        assertEquals(expected, App.longestCommonSubsequence(text1, text2));
    }

     @Test
    public void sampleTest5()
    {
        String text1 = "aa";
        String text2 = "aaaa" ;
        int expected = 2;

        assertEquals(expected, App.longestCommonSubsequence(text1, text2));
    }

     @Test
    public void sampleTest6()
    {
        String text1 = "abcde";
        String text2 = "ace" ;
        int expected = 3;

        assertEquals(expected, App.longestCommonSubsequence(text1, text2));
    }
}
