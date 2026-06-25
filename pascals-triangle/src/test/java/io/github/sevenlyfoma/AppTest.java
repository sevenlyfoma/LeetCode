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
        List<List<Integer>> expected = List.of(List.of(1),List.of(1,1),List.of(1,2,1),List.of(1,3,3,1),List.of(1,4,6,4,1));
        int numRows = 5;

        assertEquals(expected, App.generate(numRows));
    
    }


}
