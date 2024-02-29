package a10;

import java.util.Arrays;
import java.util.Comparator;

public class testSorting {

    public static void test_bubble_0() {
        Integer[] arr = { 5, 4, 3, 2, 1 };
        testComparator<Integer> comp = new testComparator<Integer>(Comparator.naturalOrder());
        System.out.println("Array before sorting: " + Arrays.toString(arr));
        Sorting.bubbleSort(arr, comp);
        System.out.println("After Bubble sorting: " + Arrays.toString(arr));
    }

    public static void test_bubble_1() {
        Integer[] arr = { 1, 2, 3, 4, 5, 6 };
        testComparator<Integer> comp = new testComparator<Integer>(Comparator.naturalOrder());
        System.out.println("Array before sorting: " + Arrays.toString(arr));
        Sorting.bubbleSort(arr, comp);
        System.out.println("After Bubble sorting: " + Arrays.toString(arr));
    }

    public static void test_bubble_2() {
        Integer[] arr = { 3, 5, 2, 7, 6, 1, 4 };
        testComparator<Integer> comp = new testComparator<Integer>(Comparator.naturalOrder());
        System.out.println("Array before sorting: " + Arrays.toString(arr));
        Sorting.bubbleSort(arr, comp);
        System.out.println("After Bubble sorting: " + Arrays.toString(arr));
    }

    public static void test_insertion_0() {
        Integer[] arr = { 5, 4, 3, 2, 1 };
        testComparator<Integer> comp = new testComparator<Integer>(Comparator.naturalOrder());
        System.out.println("Array before sorting: " + Arrays.toString(arr));
        Sorting.insertionSort(arr, comp);
        System.out.println("After Insertion sorting: " + Arrays.toString(arr));
    }

    public static void test_insertion_1() {
        Integer[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        testComparator<Integer> comp = new testComparator<Integer>(Comparator.naturalOrder());
        System.out.println("Array before sorting: " + Arrays.toString(arr));
        Sorting.insertionSort(arr, comp);
        System.out.println("After Insertion sorting: " + Arrays.toString(arr));
    }

    public static void test_insertion_2() {
        Integer[] arr = { 6, 4, 3, 1, 2, 5 };
        testComparator<Integer> comp = new testComparator<Integer>(Comparator.naturalOrder());
        System.out.println("Array before sorting: " + Arrays.toString(arr));
        Sorting.insertionSort(arr, comp);
        System.out.println("After Insertion sorting: " + Arrays.toString(arr));
    }

    public static void test_selection_0() {
        Integer[] arr = { 5, 4, 3, 2, 1 };
        testComparator<Integer> comp = new testComparator<Integer>(Comparator.naturalOrder());
        System.out.println("Array before sorting: " + Arrays.toString(arr));
        Sorting.selectionSort(arr, comp);
        System.out.println("After Selection sorting: " + Arrays.toString(arr));
    }

    public static void test_selection_1() {
        Integer[] arr = { 1, 2 };
        testComparator<Integer> comp = new testComparator<Integer>(Comparator.naturalOrder());
        System.out.println("Array before sorting: " + Arrays.toString(arr));
        Sorting.selectionSort(arr, comp);
        System.out.println("After Selection sorting: " + Arrays.toString(arr));
    }

    public static void test_selection_2() {
        Integer[] arr = { 4, 7, 3, 5, 8, 2, 6, 1 };
        testComparator<Integer> comp = new testComparator<Integer>(Comparator.naturalOrder());
        System.out.println("Array before sorting: " + Arrays.toString(arr));
        Sorting.selectionSort(arr, comp);
        System.out.println("After Selection sorting: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        // test_bubble_0();
        // test_bubble_1();
        // test_bubble_2();
        // test_insertion_0();
        // test_insertion_1();
        // test_insertion_2();
        test_selection_0();
        test_selection_1();
        test_selection_2();
    }
}
