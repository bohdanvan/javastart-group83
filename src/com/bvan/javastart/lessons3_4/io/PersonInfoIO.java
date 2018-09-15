package com.bvan.javastart.lessons3_4.io;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class PersonInfoIO {

    public static void main(String[] args) {
        // Input
        // 1. Create a Scanner object. +
        // 2. Read name and age with the scanner object.
        // 3. (optional) Close the scanner.

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scan.next();

        System.out.print("Enter age: ");
        int age = scan.nextInt();

        scan.close();

        // BL
        String message = "Hello, I'm " + name + ", "
                + age + " years old";

        // Output
        System.out.println(message);
    }
}
