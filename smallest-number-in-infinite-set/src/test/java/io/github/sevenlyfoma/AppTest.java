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
        SmallestInfiniteSet obj = new SmallestInfiniteSet();
        obj.addBack(2);
        assertEquals(1, obj.popSmallest());
        assertEquals(2, obj.popSmallest());
        assertEquals(3, obj.popSmallest());
        obj.addBack(1);
        assertEquals(1, obj.popSmallest());
        assertEquals(4, obj.popSmallest());
        assertEquals(5, obj.popSmallest());

        
    }
}
