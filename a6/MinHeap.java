package a6;

import java.util.NoSuchElementException;

/**
 * Your implementation of a MinHeap.
 */
public class MinHeap<T extends Comparable<? super T>> {

    /**
     * The initial capacity of the MinHeap.
     *
     * DO NOT MODIFY THIS VARIABLE!
     */
    public static final int INITIAL_CAPACITY = 13;

    /*
     * Do not add new instance variables or modify existing ones.
     */
    private T[] backingArray;
    private int size;

    /**
     * This is the constructor that constructs a new MinHeap.
     *
     * Recall that Java does not allow for regular generic array creation,
     * so instead we cast a Comparable[] to a T[] to get the generic typing.
     */
    public MinHeap() {
        // DO NOT MODIFY THIS METHOD!
        backingArray = (T[]) new Comparable[INITIAL_CAPACITY];
    }

    /**
     * Adds an item to the heap. If the backing array is full (except for
     * index 0) and you're trying to add a new item, then double its capacity.
     *
     * Method should run in amortized O(log n) time.
     *
     * @param data The data to add.
     * @throws java.lang.IllegalArgumentException If the data is null.
     */
    public void add(T data) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        if (data == null) {
            throw new java.lang.IllegalArgumentException("Cannot add null to heap!");
        }
        if (size + 1 == backingArray.length) {
            resizeArray();
        }
        backingArray[size + 1] = data;
        size++;
        upHeap(size); // new size here
    }

    private void upHeap(int index) {
        if (index <= 1) {
            return; // reach root, terminate the up-heap operation
        }
        if (backingArray[index / 2].compareTo(backingArray[index]) > 0) {
            swap(index, index / 2);
        }
        upHeap(index / 2);
    }

    /**
     * resize backing array
     * 
     */
    private void resizeArray() {
        T[] newArr = (T[]) (new Comparable[backingArray.length * 2]);
        for (int i = 0; i < backingArray.length; i++) {
            newArr[i] = backingArray[i];
        }
        backingArray = newArr;
    }

    /**
     * swap method
     * 
     * @param ind1 index of first item in backingArray
     * @param ind2 index of second item in backingArray
     */
    private void swap(int ind1, int ind2) {
        T temp = backingArray[ind1];
        backingArray[ind1] = backingArray[ind2];
        backingArray[ind2] = temp;
    }

    /**
     * Removes and returns the min item of the heap. As usual for array-backed
     * structures, be sure to null out spots as you remove. Do not decrease the
     * capacity of the backing array.
     *
     * Method should run in O(log n) time.
     *
     * @return The data that was removed.
     * @throws java.util.NoSuchElementException If the heap is empty.
     */
    public T remove() {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        if (size == 0) {
            throw new java.util.NoSuchElementException("Cannot remove from empty heap!");
        }
        T removedData = backingArray[1];
        backingArray[1] = backingArray[size];
        backingArray[size] = null;
        size--;
        downHeap(1);
        return removedData;
    }

    private void downHeap(int index) {
        // indices of left and right child
        int leftChild = 2 * index;
        int rightChild = 2 * index + 1;

        if (index > size / 2) { // leaf node, ternimate
            return;
        } else if (backingArray[rightChild] == null) { // 1 child case
            // only compare with left child
            if (backingArray[index].compareTo(backingArray[leftChild]) > 0) {
                swap(index, leftChild);
                downHeap(leftChild);
            } else {
                downHeap(leftChild);
            }
        } else { // 2 children case
            if (backingArray[leftChild].compareTo(backingArray[rightChild]) < 0) {
                if (backingArray[leftChild].compareTo(backingArray[index]) < 0) {
                    swap(index, leftChild);
                    downHeap(leftChild);
                } else {
                    return;
                }
            } else {
                if (backingArray[rightChild].compareTo(backingArray[index]) < 0) {
                    swap(index, rightChild);
                    downHeap(rightChild);
                } else {
                    return;
                }
            }
        }
    }

    /**
     * Returns the backing array of the heap.
     *
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return The backing array of the list
     */
    public T[] getBackingArray() {
        // DO NOT MODIFY THIS METHOD!
        return backingArray;
    }

    /**
     * Returns the size of the heap.
     *
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return The size of the list
     */
    public int size() {
        // DO NOT MODIFY THIS METHOD!
        return size;
    }
}
