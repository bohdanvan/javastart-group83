package com.bvan.javastart.lessons1_2;

/**
 * @author bvanchuhov
 */
public class Types {

    public static void main(String[] args) {
        // Primitive Types (8)

        // 1. Integer Types (4)
        byte b = 127; // 1B = 8b, -128 ... 127
        short s = 10000; // 2B = 16b, -32 000 ... +32 000
        int x = 1000000000; // 4B = 32b, max = 2 000 000 000
        long l = 1000000000000000000L; // 8B = 64b

        // 2. Floating Point Types (2)
        float f = 10.5f;
        double d = 10.5;

        // 3. Character (1)
        char c = 'a';

        // 4. Logical Type (1)
        boolean bool = true;

        // Object Types
        String str = "Hello";
    }
}
