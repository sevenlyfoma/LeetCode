package io.github.sevenlyfoma;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class RecentCounterTest 
{


    @Test
    public void sampleTest1()
    {
        RecentCounter rc = new RecentCounter();

        int[] inp = {1,100,3001,3002};
        int[] exp = {1,2,3,3};

        for (int i = 0; i < inp.length; i++){
            assertEquals(exp[i], rc.ping(inp[i]));
        }
    }
}
