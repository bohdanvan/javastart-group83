/**
 * @author bvanchuhov
 */
public class IfElsePractice {

    public static void main(String[] args) {
        int x = 40;

        if (x < 20) {
            System.out.println("1");
            if (x > 0) {
                System.out.println("4");
            } else {
                System.out.println("5");
            }
        }

        System.out.println("3");
    }
}
