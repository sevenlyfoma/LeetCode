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
    public void sampleTest2()
    {
        ListNode ln2 = new ListNode(2, null);
        ListNode ln1 = new ListNode(1, ln2);

        assertEquals(3, App.pairSum(ln1));
    }

    @Test
    public void sampleTest4()
    {
        ListNode ln4 = new ListNode(4, null);
        ListNode ln3 = new ListNode(3, ln4);
        ListNode ln2 = new ListNode(2, ln3);
        ListNode ln1 = new ListNode(1, ln2);

         assertEquals(5, App.pairSum(ln1));
    }

    @Test
    public void sampleTest6()
    {
        ListNode ln6 = new ListNode(6, null);
        ListNode ln5 = new ListNode(5, ln6);
        ListNode ln4 = new ListNode(4, ln5);
        ListNode ln3 = new ListNode(3, ln4);
        ListNode ln2 = new ListNode(2, ln3);
        ListNode ln1 = new ListNode(1, ln2);

         assertEquals(7, App.pairSum(ln1));
    }
}
