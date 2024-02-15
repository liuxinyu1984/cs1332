package a2;

import java.util.NoSuchElementException;

/**
 * Your implementation of a Singly-Linked List.
 */
public class SinglyLinkedList<T> {


    /*
     * Do not add new instance variables or modify existing ones.
     */
    private SinglyLinkedListNode<T> head;
    private SinglyLinkedListNode<T> tail;
    private int size;

    /*
     * Do not add a constructor.
     */

    /**
     * Adds the element to the front of the list.
     *
     * Method should run in O(1) time.
     *
     * @param data the data to add to the front of the list
     * @throws java.lang.IllegalArgumentException if data is null
     */
    public void addToFront(T data) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        if (data == null) {
            throw new java.lang.IllegalArgumentException("Cannot add null data!");
        }
        SinglyLinkedListNode<T> newNode = new SinglyLinkedListNode<T>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            size++;
        } else {
            newNode.setNext(head);
            head = newNode;
            size++;
        }
    }

    /**
     * Adds the element to the back of the list.
     *
     * Method should run in O(1) time.
     *
     * @param data the data to add to the back of the list
     * @throws java.lang.IllegalArgumentException if data is null
     */
    public void addToBack(T data) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        if (data == null) {
            throw new java.lang.IllegalArgumentException("Cannot add null data!");
        }
        SinglyLinkedListNode<T> newNode = new SinglyLinkedListNode<T>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            size++;
        } else {
            tail.setNext(newNode);
            tail = newNode;
            size++;
        }
    }

    /**
     * Removes and returns the first data of the list.
     *
     * Method should run in O(1) time.
     *
     * @return the data formerly located at the front of the list
     * @throws java.util.NoSuchElementException if the list is empty
     */
    public T removeFromFront() {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        T removedData;
        if (head == null) {
            throw new java.util.NoSuchElementException("Cannot remove from emtpy list!");
        } else if (head == tail) {
            removedData = head.getData();
            head = null;
            tail = null;
            size--;
        } else {
            removedData = head.getData();
            head = head.getNext();
            size--;
        }
        return removedData;
    }

    /**
     * Removes and returns the last data of the list.
     *
     * Method should run in O(n) time.
     *
     * @return the data formerly located at the back of the list
     * @throws java.util.NoSuchElementException if the list is empty
     */
    public T removeFromBack() {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        T removedData;
        if (head == null) {
            throw new java.util.NoSuchElementException("Cannot remove from emtpy list!");
        } else if (head == tail) {
            removedData = head.getData();
            head = null;
            tail = null;
            size--;
        } else {
            SinglyLinkedListNode<T> current = head;
            while(current.getNext().getNext() != null) {
                current = current.getNext();
            }
            removedData = current.getNext().getData();
            current.setNext(null);
            tail = current;
            size--;
        }
        return removedData;
    }

    /**
     * add at index.
     * 
     * @param index, data 
     * @return none
     */
    public void addAtIndex(int index, T data) {
        SinglyLinkedListNode<T> newNode = new SinglyLinkedListNode<>(data);
        if (index == 0) {
            newNode.setNext(head);
            head = newNode;
            size++;
        } else if (index == size) {
            tail.setNext(newNode);
            tail = newNode;
            size++;
        } else {
            SinglyLinkedListNode<T> curr = head;
            for (int i = 0; i < index - 1; i++) {
                curr = curr.getNext();
            }
            newNode.setNext(curr.getNext());
            curr.setNext(newNode);
            size++;
        }
    }

    /**
     * Returns the head node of the list.
     *
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return the node at the head of the list
     */
    public SinglyLinkedListNode<T> getHead() {
        // DO NOT MODIFY THIS METHOD!
        return head;
    }

    /**
     * Returns the tail node of the list.
     *
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return the node at the tail of the list
     */
    public SinglyLinkedListNode<T> getTail() {
        // DO NOT MODIFY THIS METHOD!
        return tail;
    }

    /**
     * Returns the size of the list.
     *
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return the size of the list
     */
    public int size() {
        // DO NOT MODIFY THIS METHOD!
        return size;
    }

    public void display() {
        System.out.println("-----------------------------");
        if (size == 0) {
            System.out.println("Size of SLL is " + size());
            System.out.println("head -> null");
            System.out.println("tail -> null");
        } else {
            System.out.println("Size of SLL is " + size());
            System.out.println("head -> " + head.getData());
            System.out.println("tail -> " + tail.getData());
            String listToDisplay = "";
            SinglyLinkedListNode<T> curr = head;
            while(curr.getNext() != null) {
                listToDisplay += curr.getData().toString() + "->";
                curr = curr.getNext();
            }
            listToDisplay += curr.getData().toString() + "->null";
            System.out.println(listToDisplay);
        }
    }
}
