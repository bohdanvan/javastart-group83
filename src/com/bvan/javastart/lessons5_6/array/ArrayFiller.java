package com.bvan.javastart.lessons5_6.array;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayFiller {

    public static void main(String[] args) {
        int[] array = new int[5];

        // i = 0...9
        for (int i = 0; i < array.length; i++) {
            array[i] = 3;
        }

        System.out.println(Arrays.toString(array));
    }
}
