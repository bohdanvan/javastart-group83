package com.bvan.javastart.lessons7_8.storing;

/**
 * @author bvanchuhov
 */
public class Equality {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("Hello");

        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2)); // true
    }
}
