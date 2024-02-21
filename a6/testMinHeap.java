package a6;

import java.util.Arrays;

public class testMinHeap {
    public static void test_initial() {
        MinHeap<Integer> mh = new MinHeap<>();
        System.out.println("Heap Array: ");
        System.out.println(Arrays.toString(mh.getBackingArray()));
        System.out.println("Size of heap: " + mh.size());
        System.out.println("Adding 1,2,3,4,5,6,7,8,9.......");
        mh.add(1);
        mh.add(2);
        mh.add(3);
        mh.add(4);
        mh.add(5);
        mh.add(6);
        mh.add(7);
        mh.add(8);
        mh.add(9);
        System.out.println("Heap Array: ");
        System.out.println(Arrays.toString(mh.getBackingArray()));
        System.out.println("Size of heap: " + mh.size());
    }

    public static void test_add() {
        MinHeap<Integer> mh = new MinHeap<>();
        mh.add(1);
        mh.add(2);
        mh.add(3);
        mh.add(4);
        mh.add(5);
        mh.add(6);
        mh.add(7);
        mh.add(8);
        mh.add(9);
        System.out.println("Heap Array: ");
        System.out.println(Arrays.toString(mh.getBackingArray()));
        System.out.println("Size of heap: " + mh.size());
        System.out.println("Adding 0...");
        mh.add(0);
        System.out.println("Heap Array: ");
        System.out.println(Arrays.toString(mh.getBackingArray()));
        System.out.println("Size of heap: " + mh.size());
    }

    public static void test_remove() {
        MinHeap<Integer> mh = new MinHeap<>();
        mh.add(0);
        mh.add(1);
        mh.add(2);
        mh.add(4);
        mh.add(3);
        mh.add(5);
        mh.add(7);
        mh.add(6);
        mh.add(8);
        mh.add(9);
        mh.add(10);
        System.out.println("Heap Array: ");
        System.out.println(Arrays.toString(mh.getBackingArray()));
        System.out.println("Size of heap: " + mh.size());
        System.out.println("Removing.......");
        mh.remove();
        System.out.println("Heap Array: ");
        System.out.println(Arrays.toString(mh.getBackingArray()));
        System.out.println("Size of heap: " + mh.size());

    }

    public static void main(String[] args) {
        // test_initial();
        // test_add();
        test_remove();
    }
}
