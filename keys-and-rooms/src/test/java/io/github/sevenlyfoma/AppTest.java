package io.github.sevenlyfoma;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{


    @Test
    public void sampleTest1()
    {
        List<List<Integer>> inp = List.of(List.of(1),List.of(2),List.of(3),List.of());
        
        assertTrue(App.canVisitAllRooms(inp));
    }

    @Test
    public void sampleTest2()
    {
        List<List<Integer>> inp = List.of(List.of(1,3),List.of(3,0,1),List.of(2),List.of());
        
        assertEquals(false, App.canVisitAllRooms(inp));
    }
}
