package com.bvan.javastart.lessons3_4.types.boolean_type;

/**
 * @author bvanchuhov
 */
public class BooleanExample {

    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;

        int x = 10;
        boolean b3 = x < 20; // true
        System.out.println(b3);

        boolean b4 = x >= 40; // false
        System.out.println(b4);

        System.out.println(x < 20); // true
        System.out.println(x <= 5); // false
        System.out.println(x > 10); // false
        System.out.println(x >= 10); // true
        System.out.println(x == 20); // false
        System.out.println(x != 20); // true
    }
}
