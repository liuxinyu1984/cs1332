package a4;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Your implementation of the pre-order, in-order, and post-order
 * traversals of a tree.
 */
public class Traversals<T extends Comparable<? super T>> {

    /**
     * DO NOT ADD ANY GLOBAL VARIABLES!
     */

    /**
     * Given the root of a binary search tree, generate a
     * pre-order traversal of the tree. The original tree
     * should not be modified in any way.
     *
     * This must be done recursively.
     *
     * Must be O(n).
     *
     * @param <T> Generic type.
     * @param root The root of a BST.
     * @return List containing the pre-order traversal of the tree.
     */
    public List<T> preorder(TreeNode<T> root) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        List<T> traverse_list = new LinkedList<T>();
        return preorderHelper(root, traverse_list);
    }

    private List<T> preorderHelper(TreeNode<T> node, List<T> list) {
        if (node == null) {
            return list;
        } else {
            list.add(node.getData());
            preorderHelper(node.getLeft(), list);
            preorderHelper(node.getRight(), list);
        }
        return list;
    }

    /**
     * Given the root of a binary search tree, generate an
     * in-order traversal of the tree. The original tree
     * should not be modified in any way.
     *
     * This must be done recursively.
     *
     * Must be O(n).
     *
     * @param <T> Generic type.
     * @param root The root of a BST.
     * @return List containing the in-order traversal of the tree.
     */
    public List<T> inorder(TreeNode<T> root) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        List<T> traverse_list = new LinkedList<T>();
        return inorderHelper(root, traverse_list);
    }

    private List<T> inorderHelper(TreeNode<T> node, List<T> list) {
        if (node == null) {
            return list;
        } else {
            inorderHelper(node.getLeft(), list);
            list.add(node.getData());
            inorderHelper(node.getRight(), list);
        }
        return list;
    }

    /**
     * Given the root of a binary search tree, generate a
     * post-order traversal of the tree. The original tree
     * should not be modified in any way.
     *
     * This must be done recursively.
     *
     * Must be O(n).
     *
     * @param <T> Generic type.
     * @param root The root of a BST.
     * @return List containing the post-order traversal of the tree.
     */
    public List<T> postorder(TreeNode<T> root) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        List<T> traverse_list = new LinkedList<T>();
        return postorderHelper(root, traverse_list);
    }

    private List<T> postorderHelper(TreeNode<T> node, List<T> list) {
        if (node == null) {
            return list;
        } else {
            postorderHelper(node.getLeft(), list);
            postorderHelper(node.getRight(), list);
            list.add(node.getData());
        }
        return list;
    }

}
