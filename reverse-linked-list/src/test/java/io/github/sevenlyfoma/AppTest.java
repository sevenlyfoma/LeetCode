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
        ListNode ln0 = null;
        assertEquals(null, App.reverseList(ln0));
    }

    @Test
    public void sampleTest1()
    {
        ListNode ln1 = new ListNode(1, null);
        ListNode out = App.reverseList(ln1);
        assertEquals("1-", App.makeString(out));
    }

    @Test
    public void sampleTest2()
    {
        ListNode ln2 = new ListNode(2, null);
        ListNode ln1 = new ListNode(1, ln2);
        ListNode out = App.reverseList(ln1);
        assertEquals("2-1-", App.makeString(out));
    }

    @Test
    public void sampleTest3()
    {
        ListNode ln3 = new ListNode(3, null);
        ListNode ln2 = new ListNode(2, ln3);
        ListNode ln1 = new ListNode(1, ln2);
        ListNode out = App.reverseList(ln1);
        assertEquals("3-2-1-", App.makeString(out));

    }

    @Test
    public void sampleTest4()
    {
        ListNode ln4 = new ListNode(4, null);
        ListNode ln3 = new ListNode(3, ln4);
        ListNode ln2 = new ListNode(2, ln3);
        ListNode ln1 = new ListNode(1, ln2);
        ListNode out = App.reverseList(ln1);
        assertEquals("4-3-2-1-", App.makeString(out));

    }

    @Test
    public void sampleTest5()
    {
        ListNode ln5 = new ListNode(5, null);
        ListNode ln4 = new ListNode(4, ln5);
        ListNode ln3 = new ListNode(3, ln4);
        ListNode ln2 = new ListNode(2, ln3);
        ListNode ln1 = new ListNode(1, ln2);
        ListNode out = App.reverseList(ln1);
        assertEquals("5-4-3-2-1-", App.makeString(out));

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
        ListNode out = App.reverseList(ln1);
        assertEquals("6-5-4-3-2-1-", App.makeString(out));
    }
}
