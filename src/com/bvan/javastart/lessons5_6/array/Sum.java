package com.bvan.javastart.lessons5_6.array;

/**
 * @author bvanchuhov
 */
public class Sum {

    public static void main(String[] args) {
        int[] array = {10, 20, 50, 40};

        int sum = 0;
        for (int elem : array) {
            sum += elem;
        }

        System.out.println("sum = " + sum);
    }
}
