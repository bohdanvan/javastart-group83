package com.bvan.javastart.lessons5_6.array;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayExample {

    public static void main(String[] args) {
        int[] ints;
        double[] doubles;
        String[] names;

        int[] array = new int[5]; // 4B * 5 = 20B
        int[] array2 = {30, 45, 24, 18, 53};

        int len = array.length;
        array[2] = 24;

        System.out.println("len = " + len);
        System.out.println(Arrays.toString(array));

        System.out.println(array[2]);
    }
}
