package a7;

import java.util.NoSuchElementException;

/**
 * Your implementation of a ExternalChainingHashMap.
 */
public class ExternalChainingHashMap<K, V> {

    /*
     * The initial capacity of the ExternalChainingHashMap when created with the
     * default constructor.
     *
     * DO NOT MODIFY THIS VARIABLE!
     */
    public static final int INITIAL_CAPACITY = 13;

    /*
     * The max load factor of the ExternalChainingHashMap.
     *
     * DO NOT MODIFY THIS VARIABLE!
     */
    public static final double MAX_LOAD_FACTOR = 0.67;

    /*
     * Do not add new instance variables or modify existing ones.
     */
    private ExternalChainingMapEntry<K, V>[] table;
    private int size;

    /**
     * Constructs a new ExternalChainingHashMap with an initial capacity of
     * INITIAL_CAPACITY.
     */
    public ExternalChainingHashMap() {
        // DO NOT MODIFY THIS METHOD!
        table = (ExternalChainingMapEntry<K, V>[]) new ExternalChainingMapEntry[INITIAL_CAPACITY];
    }

    /**
     * compute load factor if size = n
     * 
     * @param n The size of table
     * @return double float point load factor
     */
    private double loadFactor(int n) {
        // return load factor if size = n
        return n / ((double) table.length);
    }

    /**
     * compute the index of a key in table with length
     * 
     * @param key
     * @param length
     * @return
     */
    private int computeIndex(K key, int length) {
        return Math.abs(key.hashCode() % length);
    }

    /**
     * Adds the given key-value pair to the map. If an entry in the map
     * already has this key, replace the entry's value with the new one
     * passed in.
     *
     * In the case of a collision, use external chaining as your resolution
     * strategy. Add new entries to the front of an existing chain, but don't
     * forget to check the entire chain for duplicate keys first.
     *
     * If you find a duplicate key, then replace the entry's value with the new
     * one passed in. When replacing the old value, replace it at that position
     * in the chain, not by creating a new entry and adding it to the front.
     *
     * Before actually adding any data to the HashMap, you should check to
     * see if the table would violate the max load factor if the data was
     * added. Resize if the load factor (LF) is greater than max LF (it is
     * okay if the load factor is equal to max LF). For example, let's say
     * the table is of length 5 and the current size is 3 (LF = 0.6). For
     * this example, assume that no elements are removed in between steps.
     * If another entry is attempted to be added, before doing anything else,
     * you should check whether (3 + 1) / 5 = 0.8 is larger than the max LF.
     * It is, so you would trigger a resize before you even attempt to add
     * the data or figure out if it's a duplicate. Be careful to consider the
     * differences between integer and double division when calculating load
     * factor.
     *
     * When regrowing, resize the length of the backing table to
     * (2 * old length) + 1. You should use the resizeBackingTable method to do so.
     *
     * @param key   The key to add.
     * @param value The value to add.
     * @return null if the key was not already in the map. If it was in the
     *         map, return the old value associated with it.
     * @throws java.lang.IllegalArgumentException If key or value is null.
     */
    public V put(K key, V value) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        if (key == null || value == null) {
            throw new java.lang.IllegalArgumentException("Cannot put pair with null key or value!");
        }
        if (loadFactor(size + 1) > MAX_LOAD_FACTOR) {
            resizeBackingTable(2 * table.length + 1);
        }
        int index = computeIndex(key, table.length);
        if (table[index] == null) {
            table[index] = new ExternalChainingMapEntry<K, V>(key, value);
            size++;
            return null;
        } else {
            ExternalChainingMapEntry<K, V> pointer = table[index];
            while (pointer != null) {
                if (pointer.getKey().equals(key)) { // duplicate found
                    V replacedValue = pointer.getValue();
                    pointer.setValue(value);
                    return replacedValue;
                }
                pointer = pointer.getNext();
            } // after this loop is executed and no duplicate found, add to front
            table[index] = new ExternalChainingMapEntry<>(key, value, table[index]);
            size++;
            return null;
        }
    }

    /**
     * Removes the entry with a matching key from the map.
     *
     * @param key The key to remove.
     * @return The value associated with the key.
     * @throws java.lang.IllegalArgumentException If key is null.
     * @throws java.util.NoSuchElementException   If the key is not in the map.
     */
    public V remove(K key) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        if (key == null) {
            throw new java.lang.IllegalArgumentException("Key cannot be null!");
        }
        int index = computeIndex(key, table.length);
        ExternalChainingMapEntry<K, V> pointer = table[index];
        if (pointer == null) { // empty slot in index
            throw new java.util.NoSuchElementException("Key not found in HashMap! (without chaining)");
        }
        if (pointer.getKey().equals(key)) { // edge case: key found at head of LL
            V removedValue = pointer.getValue();
            table[index] = pointer.getNext();
            size--;
            return removedValue;
        } else { // general case
            while (pointer.getNext() != null) {
                if (pointer.getNext().getKey().equals(key)) {
                    V removedValue = pointer.getNext().getValue();
                    pointer.setNext(pointer.getNext().getNext());
                    size--;
                    return removedValue;
                }
                pointer = pointer.getNext();
            } // after the loop is executed, key is not found
            throw new java.util.NoSuchElementException("Key not found in HashMap!");
        }
    }

    /**
     * Helper method stub for resizing the backing table to length.
     *
     * This method should be called in put() if the backing table needs to
     * be resized.
     *
     * You should iterate over the old table in order of increasing index and
     * add entries to the new table in the order in which they are traversed.
     *
     * Since resizing the backing table is working with the non-duplicate
     * data already in the table, you won't need to explicitly check for
     * duplicates.
     *
     * Hint: You cannot just simply copy the entries over to the new table.
     *
     * @param Length The new length of the backing table.
     */
    private void resizeBackingTable(int length) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        ExternalChainingMapEntry<K, V>[] newTable = (ExternalChainingMapEntry<K, V>[]) new ExternalChainingMapEntry[length];

        for (ExternalChainingMapEntry<K, V> entry : table) {
            if (entry != null) {
                newTable[computeIndex(entry.getKey(), length)] = entry;
            }
        }
        table = newTable;
    }

    /**
     * Returns whether or not the key is in the map.
     *
     * @param key The key to search for in the map. You may assume that the
     *            key is never null.
     * @return true if the key is contained within the map, false otherwise.
     */
    public boolean containsKey(K key) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        if (key == null) {
            throw new java.lang.IllegalArgumentException("Key cannot be null!");
        }
        int index = computeIndex(key, table.length);
        ExternalChainingMapEntry<K, V> pointer = table[index];
        while (pointer != null) {
            if (pointer.getKey().equals(key)) {
                return true;
            }
            pointer = pointer.getNext();
        }
        return false;
    }

    /**
     * Returns the table of the map.
     *
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return The table of the map.
     */
    public ExternalChainingMapEntry<K, V>[] getTable() {
        // DO NOT MODIFY THIS METHOD!
        return table;
    }

    /**
     * Returns the size of the map.
     *
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return The size of the map.
     */
    public int size() {
        // DO NOT MODIFY THIS METHOD!
        return size;
    }
}
