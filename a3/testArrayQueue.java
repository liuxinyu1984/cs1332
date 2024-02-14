package a3;

import java.util.Arrays;

public class testArrayQueue {
    public static void test_display() {
        ArrayQueue<Integer> aq = new ArrayQueue<>();
        System.out.println(Arrays.toString(aq.getBackingArray()));
        int n = 4;
        for(int i = 0; i < n; i++) {
            aq.enqueue(i);
        }
        System.out.println(Arrays.toString(aq.getBackingArray()));
    }

    public static void test_enqueue() {
        ArrayQueue<Integer> aq = new ArrayQueue<>();
        System.out.println("Initializing ArrayQueue");
        System.out.println(Arrays.toString(aq.getBackingArray()));
        int n = 10;
        for(int i = 0; i < n; i++) {
            aq.enqueue(i);
        }
        System.out.println(Arrays.toString(aq.getBackingArray()));
    }

    public static void test_dequeue() {
        ArrayQueue<Integer> aq = new ArrayQueue<>();
        int n = 7;
        for(int i = 0; i < n; i++) {
            aq.enqueue(i);
        }
        System.out.println("Initial ArrayQueue:");
        System.out.println(Arrays.toString(aq.getBackingArray()));
        System.out.println("Size, front are " + aq.size() + ", " + aq.getFront());
        System.out.println("Dequeued item: " + aq.dequeue());
        System.out.println(Arrays.toString(aq.getBackingArray()));
        System.out.println("Size, front are " + aq.size() + ", " + aq.getFront());
        System.out.println("Dequeued item: " + aq.dequeue());
        System.out.println(Arrays.toString(aq.getBackingArray()));
        System.out.println("Size, front are " + aq.size() + ", " + aq.getFront());
    }

    /**
     * enqueue -> dequeue -> enqueue
     * 
     */
    public static void test_1() {
        ArrayQueue<Integer> aq = new ArrayQueue<>();
        System.out.println("Initializing ArrayQueue");
        System.out.println(Arrays.toString(aq.getBackingArray()));
        int n = 8;
        for(int i = 0; i < n; i++) {
            aq.enqueue(i);
        }
        System.out.println(Arrays.toString(aq.getBackingArray()));
        int m = 6;
        for(int j = 0; j < m; j++) {
            System.out.println("Dequeued item: " + aq.dequeue());
        }
        System.out.println(Arrays.toString(aq.getBackingArray()));
        int k = 8;
        for(int i = 0; i < k; i++) {
            aq.enqueue(8 + i);
        }
        System.out.println(Arrays.toString(aq.getBackingArray()));
    }

    public static void main(String[] args) {
        //test_display();
        //test_enqueue();
        //test_dequeue();
        test_1();
    }
}
