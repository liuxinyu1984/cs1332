package a5;

public class testBST {
    public static void test_add() {
        BST<Integer> bst = new BST<>();
        bst.add(50);
        bst.add(15);
        bst.add(75);
        bst.add(5);
        bst.add(10);
        bst.add(100);

        Traversals<Integer> traverse = new Traversals<>();
        System.out.println("Size of tree: " + bst.size());
        System.out.println("Levelorder traverse of tree: " + traverse.levelorder(bst.getRoot()));

        int n = 25;
        System.out.println("Adding new node with data " + n);
        bst.add(n);
        System.out.println("Size of tree: " + bst.size());
        System.out.println("Levelorder traverse of tree: " + traverse.levelorder(bst.getRoot()));

    }

    public static void test_remove_0() {
        BST<Integer> bst = new BST<>();
        bst.add(50);
        bst.add(15);
        bst.add(75);
        bst.add(5);
        bst.add(10);
        bst.add(100);

        Traversals<Integer> traverse = new Traversals<>();
        System.out.println("Size of tree: " + bst.size());
        System.out.println("Levelorder traverse of tree: " + traverse.levelorder(bst.getRoot()));

        int n = 10;
        System.out.println("Removing node with data " + n);
        bst.remove(n);
        System.out.println("Size of tree: " + bst.size());
        System.out.println("Levelorder traverse of tree: " + traverse.levelorder(bst.getRoot()));
    }

    public static void test_remove_1() {
        BST<Integer> bst = new BST<>();
        bst.add(50);
        bst.add(15);
        bst.add(75);
        bst.add(5);
        bst.add(10);
        bst.add(100);

        Traversals<Integer> traverse = new Traversals<>();
        System.out.println("Size of tree: " + bst.size());
        System.out.println("Levelorder traverse of tree: " + traverse.levelorder(bst.getRoot()));

        int n = 5;
        System.out.println("Removing node with data " + n);
        bst.remove(n);
        System.out.println("Size of tree: " + bst.size());
        System.out.println("Levelorder traverse of tree: " + traverse.levelorder(bst.getRoot()));
    }

    public static void test_remove_2() {
        BST<Integer> bst = new BST<>();
        bst.add(50);
        bst.add(15);
        bst.add(75);
        bst.add(5);
        bst.add(25);
        bst.add(20);
        bst.add(100);

        Traversals<Integer> traverse = new Traversals<>();
        System.out.println("Size of tree: " + bst.size());
        System.out.println("Levelorder traverse of tree: " + traverse.levelorder(bst.getRoot()));

        int n = 15;
        System.out.println("Removing node with data " + n);
        bst.remove(n);
        System.out.println("Size of tree: " + bst.size());
        System.out.println("Levelorder traverse of tree: " + traverse.levelorder(bst.getRoot()));
    }

    public static void main(String[] args) {
        // test_add();
        // test_remove_0();
        // test_remove_1();
        test_remove_2();
    }
}
