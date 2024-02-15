package a2;

public class testSinglyLinkedList {
    public static void test_display() {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        sll.display();
        sll.addToFront(1);
        sll.display();
        sll.addToFront(2);
        sll.display();
        sll.addToFront(3);
        sll.display();
        sll.addToBack(4);
        sll.display();
    }

    public static void test_remove() {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        int n = 10;
        for(int i = 0; i < n; i++) {
            sll.addToBack(i);
        }
        sll.display();
        sll.removeFromBack();
        sll.removeFromFront();
        sll.removeFromBack();
        sll.display();
    }

    public static void test_insert() {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        int n = 10;
        for(int i = 0; i < n; i++) {
            sll.addToBack(i);
        }
        sll.display();
        sll.addAtIndex(3, 97);
        sll.display();
    }

    public static void main(String[] args) {
        //test_display();
        //test_remove();
        test_insert();
    }
}
