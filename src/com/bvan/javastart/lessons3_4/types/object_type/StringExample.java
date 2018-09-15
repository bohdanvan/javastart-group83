package com.bvan.javastart.lessons3_4.types.object_type;

/**
 * @author bvanchuhov
 */
public class StringExample {

    public static void main(String[] args) {
        String s = "Java!";

        int len = s.length();
        System.out.println("len = " + len); // 5

        char c = s.charAt(2);
        System.out.println("c = " + c); //

        char lastChar = s.charAt(s.length() - 1);
        System.out.println("lastChar = " + lastChar);
    }
}
