/**
 * @author bvanchuhov
 */
public class Radix {

    public static void main(String[] args) {
        int a = 0b010101; // radix = 2, {0, 1}
        int b = 010 ; // radix = 8, {0, 1, ... 7}
        int c = 123; // radix = 10, {0, 1, ... 9}
        int d = 0xABBA; // radix = 16, {0, 1, ... 9, A, B, C, D, E, F}

        System.out.println(d);
    }
}
