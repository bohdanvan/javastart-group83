/**
 * @author bvanchuhov
 */
public class ZeroDivision {

    public static void main(String[] args) {
        System.out.println(1.0 / 0); // Infinity
        System.out.println(-1.0 / 0); // -Infinity
        System.out.println(0.0 / 0); // NaN (Not a Number)
//        System.out.println(1 / 0); // ArithmeticException
        System.out.println("Bye");
    }
}
