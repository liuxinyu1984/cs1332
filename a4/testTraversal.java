package a4;

import a4.TreeNode;

public class testTraversal {
    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<Integer>(50);
        TreeNode<Integer> root_left = new TreeNode<Integer>(25);
        TreeNode<Integer> root_right = new TreeNode<Integer>(100);
        TreeNode<Integer> root_left_left = new TreeNode<Integer>(10);
        TreeNode<Integer> root_right_left = new TreeNode<Integer>(75);
        TreeNode<Integer> root_right_right = new TreeNode<Integer>(125);
        TreeNode<Integer> root_right_right_left = new TreeNode<Integer>(110);

        root.setLeft(root_left);
        root.setRight(root_right);
        root_left.setLeft(root_left_left);
        root_right.setLeft(root_right_left);
        root_right.setRight(root_right_right);
        root_right_right.setLeft(root_right_right_left);

        Traversals<Integer> traverse = new Traversals<>();
        System.out.println("Preorder traverse: " + traverse.preorder(root));
        System.out.println("Inorder traverse: " + traverse.inorder(root));
        System.out.println("Postorder traverse: " + traverse.postorder(root));
        
    }
}
