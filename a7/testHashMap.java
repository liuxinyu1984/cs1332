package a7;

import java.util.Arrays;

public class testHashMap {
    // private static <K, V> void checkContains(ExternalChainingHashMap<K, V> map, K
    // key) {
    // System.out.println("Contains " + key + " : " + map.containsKey(key));
    // }

    public static <K, V> void printMap(ExternalChainingHashMap<K, V> map) {
        String repr = String.format("-- Map of size: %s, capacity: %s:\n%s\n", map.size(), map.getTable().length,
                printTable(map.getTable()));
        System.out.println(repr);
    }

    public static <K, V> String printTable(ExternalChainingMapEntry<K, V>[] table) {
        return Arrays.stream(table).map(testHashMap::printEntry).toList().toString();
    }

    public static <K, V> String printEntry(ExternalChainingMapEntry<K, V> entry) {
        StringBuilder ret = new StringBuilder("");
        if (entry == null) {
            ret.append("null");
        } else {
            while (entry != null) {
                ret.append(entry.toString());
                if (entry.getNext() != null) {
                    ret.append("--");
                }
                entry = entry.getNext();
            }
        }
        return ret.toString();
    }

    public static void test_0() {
        System.out.println("-------------T0------------------");
        ExternalChainingHashMap<Integer, Integer> map = new ExternalChainingHashMap<>();
        printMap(map);
        // checkContains(map, 0);
    }

    public static void test_1() {
        System.out.println("-------------T1------------------");
        ExternalChainingHashMap<Integer, Integer> map = new ExternalChainingHashMap<>();
        printMap(map);
        map.put(5, 5);
        printMap(map);
    }

    public static void test_2() {
        System.out.println("-------------T2------------------");
        ExternalChainingHashMap<Integer, Integer> map = new ExternalChainingHashMap<>();
        map.put(19, 19);
        map.put(8, 8);
        map.put(11, 11);
        map.put(6, 6);
        map.put(25, 25);
        printMap(map);
        map.put(32, 32);
        printMap(map);
    }

    public static void test_3() {
        System.out.println("-------------T3------------------");
        ExternalChainingHashMap<Integer, Integer> map = new ExternalChainingHashMap<>();
        map.put(4, 4);
        printMap(map);
        map.remove(4);
        printMap(map);
    }

    public static void test_4() {
        System.out.println("-------------T4------------------");
        ExternalChainingHashMap<Integer, Integer> map = new ExternalChainingHashMap<>();
        map.put(6, 6);
        map.put(19, 19);
        map.put(8, 8);
        map.put(37, 37);
        map.put(24, 24);
        map.put(11, 11);
        printMap(map);
        map.remove(11);
        printMap(map);
    }

    public static void test_5() {
        System.out.println("-------------T5------------------");
        ExternalChainingHashMap<Integer, Integer> map = new ExternalChainingHashMap<>();
        map.put(6, 6);
        map.put(19, 19);
        map.put(8, 8);
        map.put(37, 37);
        map.put(24, 24);
        map.put(11, 11);
        printMap(map);
        map.remove(7);
        printMap(map);
    }

    public static void test_remove_empty() {
        ExternalChainingHashMap<Integer, Integer> map = new ExternalChainingHashMap<>();
        printMap(map);
        map.remove(3);
    }

    public static void main(String[] args) {
        // test_0();
        // test_1();
        // test_2();
        // test_3();
        // test_4();
        // test_5();
        test_remove_empty();
    }

}
