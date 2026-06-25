package io.github.sevenlyfoma;

import java.util.List;

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
        int k = 3;
        int n = 7;

        List<List<Integer>> output = List.of(List.of(1,2,4));

        assertEquals(output, App.combinationSum3(k, n));
    }

    @Test
    public void sampleTest2()
    {
        int k = 3;
        int n = 9;

        List<List<Integer>> output = List.of(List.of(1,2,6),List.of(1,3,5),List.of(2,3,4));

        assertEquals(output, App.combinationSum3(k, n));
    }

    @Test
    public void sampleTest3()
    {
        int k = 4;
        int n = 1;

        List<List<Integer>> output = List.of();

        assertEquals(output, App.combinationSum3(k, n));
    }
}
