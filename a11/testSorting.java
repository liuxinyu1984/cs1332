package a11;

import java.util.Arrays;
import java.util.Comparator;

public class testSorting {

    // change private to public for merge method
    // public static void test_merge() {
    // Integer[] left = { 1, 3, 5 };
    // Integer[] right = { 2, 4, 6 };
    // Integer[] arr = new Integer[left.length + right.length];
    // testComparator<Integer> comp = new
    // testComparator<Integer>(Comparator.naturalOrder());
    // Sorting.merge(arr, left, right, comp);
    // System.out.println(Arrays.toString(arr));
    // }

    public static void test_merge_0() {
        Integer[] arr = { 5, 4, 3, 2, 1 };
        testComparator<Integer> comp = new testComparator<Integer>(Comparator.naturalOrder());
        System.out.println("Array before sorting: " + Arrays.toString(arr));
        Sorting.mergeSort(arr, comp);
        System.out.println("After Merge sorting: " + Arrays.toString(arr));
    }

    public static void test_merge_1() {
        Integer[] arr = { 3, 5, 2, 7, 1, 6, 0, 4 };
        testComparator<Integer> comp = new testComparator<Integer>(Comparator.naturalOrder());
        System.out.println("Array before sorting: " + Arrays.toString(arr));
        Sorting.mergeSort(arr, comp);
        System.out.println("After Merge sorting: " + Arrays.toString(arr));
    }

    // change private to public for numberOfDigits method
    // public static void test_numberOfDigits() {
    // int n = 0;
    // System.out.println("Number of digits of " + n + " is " +
    // Sorting.numberOfDigits(n));
    // }

    // change private to public for getDigit method
    // public static void test_getDigit() {
    // int n = 12345;
    // int k = 3;
    // System.out.println("The " + k + "th digit of " + n + " is: " +
    // Sorting.getDigit(n, k));
    // }

    public static void test_lsd() {
        int[] arr = { 1000, 2014, 231, 53, -1, -92, -9403, 634, -207 };
        Sorting.lsdRadixSort(arr);
        System.out.println("After LSD Radix sorting: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        // test_merge();
        // test_merge_0();
        // test_merge_1();

        // test_numberOfDigits();
        // test_getDigit();

        test_lsd();
    }

}
