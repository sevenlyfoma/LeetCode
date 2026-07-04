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
        int[] input = {1,2,3,4,5,6,7};
        int k = 3;

        App.rotate(input, k);

        int[] expectec = {5,6,7,1,2,3,4};

        assertArrayEquals(expectec, input);
    }

    @Test
    public void sampleTest2()
    {
        int[] input = {-1,-100,3,99};
        int k = 2;

        App.rotate(input, k);

        int[] expectec = {3,99,-1,-100};

        assertArrayEquals(expectec, input);
    }

    @Test
    public void sampleTest3()
    {
        int[] input = {1,2};
        int k = 0;

        App.rotate(input, k);

        int[] expectec = {1,2};

        assertArrayEquals(expectec, input);
    }

    @Test
    public void sampleTest4()
    {
        int[] input = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54};
        int k = 45;

        App.rotate(input, k);

        int[] expectec = {10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,1,2,3,4,5,6,7,8,9};

        assertArrayEquals(expectec, input);
    }


    @Test
    public void sampleTest5()
    {
        int[] input = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27};
        int k = 38;

        App.rotate(input, k);

        int[] expectec = {17,18,19,20,21,22,23,24,25,26,27,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};

        assertArrayEquals(expectec, input);
    }

}
