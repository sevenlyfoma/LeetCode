package io.github.sevenlyfoma;

import static org.junit.Assert.assertFalse;
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
    public void sampleTest1()
    {
        Trie root = new Trie();

        root.insert("apple"); 
        
        assertTrue(root.search("apple"));
        assertFalse(root.search("appleF"));

        assertFalse(root.search("app"));

        assertTrue(root.startsWith("app"));

        root.insert("app");

        assertTrue(root.search("app"));
    }
}
