package io.github.sevenlyfoma;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        TreeNode root = new TreeNode();

        Integer[] inp = {1,null,2,null,3,null,4,null,5};

        root.buildTree(inp);

        root.printTree(0);
    }

    public static int longestZigZag(TreeNode root) {
        return 0;
    }
}
