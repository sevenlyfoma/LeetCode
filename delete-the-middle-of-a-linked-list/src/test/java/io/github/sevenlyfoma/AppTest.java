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
    public void sampleTest0()
    {
        assertEquals(null, App.deleteMiddle(null));
    }

    @Test
    public void sampleTest1()
    {
        ListNode ln = new ListNode(4, null);
        assertEquals(null, App.deleteMiddle(ln));
    }


    @Test
    public void sampleTest2()
    {
        ListNode ln2 = new ListNode(4, null);
        ListNode ln = new ListNode(4, ln2);
        App.deleteMiddle(ln);
        assertEquals(null, ln.next);
    }

    @Test
    public void sampleTest3()
    {
        ListNode ln3 = new ListNode(4, null);
        ListNode ln2 = new ListNode(4, ln3);
        ListNode ln = new ListNode(4, ln2);
        App.deleteMiddle(ln);
        assertEquals(ln3, ln.next);
    }

    @Test
    public void sampleTest4()
    {
        ListNode ln4 = new ListNode(4, null);
        ListNode ln3 = new ListNode(4, ln4);
        ListNode ln2 = new ListNode(4, ln3);
        ListNode ln = new ListNode(4, ln2);
        App.deleteMiddle(ln);
        assertEquals(ln4, ln.next.next);
    }

    @Test
    public void sampleTest5()
    {
        ListNode ln5 = new ListNode(4, null);
        ListNode ln4 = new ListNode(4, ln5);
        ListNode ln3 = new ListNode(4, ln4);
        ListNode ln2 = new ListNode(4, ln3);
        ListNode ln = new ListNode(4, ln2);
        App.deleteMiddle(ln);
        assertEquals(ln4, ln.next.next);
    }

}
