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

        Integer[] inp = {5,3,6,2,4,null,7};

        root.buildTree(inp);

        TreeNode rootExp = new TreeNode();

        Integer[] exp = {5,4,6,2,null,null,7};

        rootExp.buildTree(exp);


        root.printTree(0);

        System.out.println("");

        // TreeNode res = App.deleteNode(root, 3)

    }

    public static TreeNode deleteNode(TreeNode root, int key) {

        if (root == null){
            return null;
        }

        if (root.val == key){

            if (root.right == null && root.left == null){
                return null;
            }
            else if (root.right == null){
                return root.left;
            }
            else if (root.left == null){
                return root.right;
            }
            else{
                insertNode(root.right, root.left);
                return root.right;
            }



        }

        else if (root.val > key){
            root.left = deleteNode(root.left, key);
        }
        else {
            root.right = deleteNode(root.right, key);
        }

        
        return root;
    }

    public static void insertNode(TreeNode target, TreeNode insertion){

        if (target == null){
            return;
        }

        if (insertion.val < target.val){
            if (target.left == null){
                target.left = insertion;
            }
            else{
                insertNode(target.left, insertion);
            }
        }
        else{
            if (target.right == null){
                target.right = insertion;
            }
            else{
                insertNode(target.right, insertion);
            }
        }
        

    }


}
