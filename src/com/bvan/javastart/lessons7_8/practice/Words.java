package com.bvan.javastart.lessons7_8.practice;

/**
 * @author bvanchuhov
 */
public class Words {

    public static void main(String[] args) {
//        testTotalLength();
        testContainsEmptyWord();
    }

    public static void testContainsEmptyWord() {
        System.out.println(containsEmptyWord(
                new String[] {"AA", "BBB", "C"}
        )); // false
        System.out.println(containsEmptyWord(
                new String[] {"AA", "", "C"}
        )); // true
        System.out.println(containsEmptyWord(
                new String[] {"", "", ""}
        )); // true
        System.out.println(containsEmptyWord(
                new String[] {}
        )); // false
    }

    public static void testTotalLength() {
        System.out.println(totalLength(
                new String[]{"AA", "BBB", "C"}
        )); // 6
        System.out.println(totalLength(
                new String[]{"AA"}
        )); // 2
        System.out.println(totalLength(
                new String[]{}
        )); // 0
        System.out.println(totalLength(
                new String[]{""}
        )); // 0
    }

    public static boolean containsEmptyWord(String[] words) {
        // iter + Enter
        for (String word : words) {
            if (word.equals("")) {
                return true;
            }
        }

        return false;
    }

    public static int totalLength(String[] words) {
        int totalLength = 0;
        for (String word : words) {
            totalLength += word.length();
        }
        return totalLength;
    }
}
