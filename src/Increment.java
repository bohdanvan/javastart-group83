/**
 * @author bvanchuhov
 */
public class Increment {

    public static void main(String[] args) {
        int x = 10;

        System.out.println(x++); // 10
        System.out.println(x); // 11

        int y = 10;
        System.out.println(++y); // 11
        System.out.println(y); // 11

        int z = 0;
        z = z++ + ++z;
        // z = 0 + ++z;   z = 1
        // z = 0 + 2;     z = 2
        System.out.println(z);
    }
}
