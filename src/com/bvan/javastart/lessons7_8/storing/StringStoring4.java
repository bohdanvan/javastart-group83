package com.bvan.javastart.lessons7_8.storing;

/**
 * @author bvanchuhov
 */
public class StringStoring4 {

    public static void main(String[] args) {
        String s = "Hello";
        s = addHello(s);
        System.out.println(s);
    }

    public static String addHello(String s) {
        s += ", world";
        return s;
    }
}
