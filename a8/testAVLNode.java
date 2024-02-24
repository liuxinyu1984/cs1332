package a8;

public class testAVLNode {

    public static void test_null_node() {
        AVLNode<Integer> node = new AVLNode<>(1);
        System.out.println(node.getData());
        System.out.println(node.getHeight());
        System.out.println(node.getBalanceFactor());
        System.out.println(node.getLeft());
        System.out.println(node.getRight());

        // System.out.println(node.getLeft().getBalanceFactor());
    }

    public static void main(String[] args) {
        test_null_node();
    }
}
