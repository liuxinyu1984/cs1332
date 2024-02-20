package a5;

import java.util.List;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
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
     * @param <T>  Generic type.
     * @param root The root of a BST.
     * @return List containing the pre-order traversal of the tree.
     */
    public List<T> preorder(BSTNode<T> root) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        List<T> traverse_list = new LinkedList<T>();
        return preorderHelper(root, traverse_list);
    }

    private List<T> preorderHelper(BSTNode<T> node, List<T> list) {
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
     * @param <T>  Generic type.
     * @param root The root of a BST.
     * @return List containing the in-order traversal of the tree.
     */
    public List<T> inorder(BSTNode<T> root) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        List<T> traverse_list = new LinkedList<T>();
        return inorderHelper(root, traverse_list);
    }

    private List<T> inorderHelper(BSTNode<T> node, List<T> list) {
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
     * @param <T>  Generic type.
     * @param root The root of a BST.
     * @return List containing the post-order traversal of the tree.
     */
    public List<T> postorder(BSTNode<T> root) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        List<T> traverse_list = new LinkedList<T>();
        return postorderHelper(root, traverse_list);
    }

    private List<T> postorderHelper(BSTNode<T> node, List<T> list) {
        if (node == null) {
            return list;
        } else {
            postorderHelper(node.getLeft(), list);
            postorderHelper(node.getRight(), list);
            list.add(node.getData());
        }
        return list;
    }

    List<T> levelorder(BSTNode<T> root) {
        if (root == null) {
            return new LinkedList<>();
        }
        Deque<BSTNode<T>> q = new ArrayDeque<>();
        List<T> ret = new LinkedList<T>();
        q.add(root);
        while (!q.isEmpty()) {
            BSTNode<T> curr = q.pop();
            ret.add(curr.getData()); // for return
            if (curr.getLeft() != null)
                q.add(curr.getLeft());
            if (curr.getRight() != null)
                q.add(curr.getRight());
        }
        return ret;
    }

}
