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

        TreeNode tn1 = new TreeNode(7);
        TreeNode tn2 = new TreeNode(15);
        TreeNode tn3 = new TreeNode(20, tn2, tn1);
        TreeNode tn4 = new TreeNode(9);
        TreeNode tn5 = new TreeNode(3, tn4, tn3);

        assertEquals(3, App.maxDepth(tn5));
    }


}
