package io.github.sevenlyfoma;

import java.util.ArrayDeque;

public class TreeNode {
    @SuppressWarnings("unused")
    int val;
    @SuppressWarnings("unused")
    TreeNode left;
    @SuppressWarnings("unused")
    TreeNode right;
    @SuppressWarnings("unused")
    TreeNode() {}
    @SuppressWarnings("unused")
    TreeNode(int val) { this.val = val; }
    @SuppressWarnings("unused")
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @SuppressWarnings("unused")
    void buildTree(Integer[] vals) {
        if (vals.length == 0){
            return;
        }
        ArrayDeque<TreeNode> buildQueue = new ArrayDeque<>();

        this.val = vals[0];

        buildQueue.add(this);

        TreeNode current;

        for (int i = 1; i < vals.length; i+=2){
            current = buildQueue.pollFirst();
            Integer x = vals[i];

            Integer y = null;
            if (i+1 < vals.length){
                y = vals[i+1];
            }
            
            
            TreeNode ln = null;
            TreeNode rn = null;

            if (x != null){
                ln = new TreeNode(x);
                buildQueue.add(ln);
            }

            if (y != null){
                rn = new TreeNode(y);
                buildQueue.add(rn);
            }

            current.left = ln;
            current.right = rn;
        }
    }

    @SuppressWarnings("unused")
    void printTree(int depth){
        for (int i = 0; i < depth; i++){
            System.out.print("  ");
        }
        System.out.print(this.val);
        System.out.print("\n");
        
        if (this.left != null){
            this.left.printTree(depth+1);
        }
        if (this.right != null){
            this.right.printTree(depth+1);
        }
    }
}