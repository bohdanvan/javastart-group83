/**
 * @author bvanchuhov
 */
public class Overflow {

    public static void main(String[] args) {
        byte b = 127;
        b += 10;
        System.out.println(b);
    }
}
