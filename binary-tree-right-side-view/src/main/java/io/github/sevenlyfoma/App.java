package io.github.sevenlyfoma;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        TreeNode root = new TreeNode();

        Integer[] inp = {1,2,3,4,null,null,null,5, null};

        root.buildTree(inp);

        root.printTree(0);

        System.out.println(rightSideView(root));
    }

    public static List<Integer> rightSideView(TreeNode root) {

        ArrayList<Integer> ans = new ArrayList<>();

        if (root == null){
            return ans;
        }

        ArrayDeque<TreeNode> bfsQueue = new ArrayDeque<>();

        bfsQueue.add(root);

        int numberAtThisLevel = 1;
        int numberAtNextLevel = 0;
        while (!bfsQueue.isEmpty()){

            TreeNode current = bfsQueue.poll();

            if (current.left != null){
                bfsQueue.add(current.left);
                numberAtNextLevel++;
            }
            if (current.right != null){
                bfsQueue.add(current.right);
                numberAtNextLevel++;
            }

            numberAtThisLevel--;
            if (numberAtThisLevel == 0){
                ans.add(current.val);
                numberAtThisLevel = numberAtNextLevel;
                numberAtNextLevel = 0;
            }
            
        }
        
        
        return ans;
    }

}
