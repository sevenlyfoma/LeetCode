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

        Integer[] inp = {3,1,4,3,null,1,5};

        root.buildTree(inp);

        root.printTree(0);
    }

    public static int goodNodes(TreeNode root) {
        
        return goodNodesRecursive(root, Integer.MIN_VALUE);
    }

    public static int goodNodesRecursive(TreeNode node, int currentMax) {
        if (node == null){
            return 0;
        }

        int count = 0;
        int newMax = currentMax;

        if (node.val >= currentMax){
            count += 1;
            newMax = node.val;
        }

        count += goodNodesRecursive(node.left, newMax);
        count += goodNodesRecursive(node.right, newMax);


        

        return count;
    }
}
