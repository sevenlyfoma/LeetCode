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
        return longestZigZagR(root, 0, true);
    }

    public static int longestZigZagR(TreeNode root, int zigZagCount, boolean zigZagLeftNext) {

        if (root == null){
            return zigZagCount - 1;
        }
        


        int longestLeft;
        int longestRight;

        if (zigZagLeftNext){
            longestLeft = longestZigZagR(root.left, zigZagCount+1, false);
            longestRight = longestZigZagR(root.right, 1, true);
        }
        else{
            longestLeft = longestZigZagR(root.left, 1, false);
            longestRight = longestZigZagR(root.right, zigZagCount+1, true);
        }

        if (longestLeft > longestRight){
            return longestLeft;
        }
        return longestRight;
    }
}
