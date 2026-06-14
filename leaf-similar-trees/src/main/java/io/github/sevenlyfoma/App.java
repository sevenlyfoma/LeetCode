package io.github.sevenlyfoma;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        
        ArrayList<Integer> leaves1 = getLeaves(root1);
        ArrayList<Integer> leaves2 = getLeaves(root2);


        return (leaves1.equals(leaves2));
    }

    public static ArrayList<Integer> getLeaves(TreeNode root){
        ArrayList<Integer> leaves = new ArrayList<>();
        

        getLeavesRecursive(root, leaves);

        return leaves;
    }

    public static void getLeavesRecursive(TreeNode node, ArrayList<Integer> leaves){

        if (node == null){
            return;
        }

        if (node.left == null && node.right == null){
            leaves.add(node.val);
        }

        else {
            getLeavesRecursive(node.left, leaves);
            getLeavesRecursive(node.right, leaves);
        }

    }
}
