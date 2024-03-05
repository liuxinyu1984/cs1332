package a12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class testBM {
    public static void test_table() {
        String pattern = "octocat";
        Map<Character, Integer> table = PatternMatching.buildLastTable(pattern);
        System.out.println("Testing Last Occurrence Table.......");
        System.out.println("Last occurrence index of o: " + table.get('o'));
        System.out.println("Last occurrence index of c: " + table.get('c'));
        System.out.println("Last occurrence index of t: " + table.get('t'));
        System.out.println("Last occurrence index of a: " + table.get('a'));
        System.out.println("Last occurrence index of b: " + table.get('b'));
    }

    public static void test_bm() {
        String pattern = "ac";
        String text = "abcacbabaca";
        CharacterComparator comp = new CharacterComparator();
        System.out.println(PatternMatching.boyerMoore(pattern, text, comp));
    }

    public static void main(String[] args) {
        // test_table();
        test_bm();
    }
}
