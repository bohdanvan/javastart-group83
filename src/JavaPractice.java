/**
 * @author bvanchuhov
 */
public class JavaPractice {

    public static void main(String[] args) {
        String s = "Hello, Java";

        String upperCase = s.toUpperCase();
        System.out.println(upperCase);

        int pos = s.indexOf("Java");
        System.out.println(pos);

        boolean startsWithJava = s.startsWith("Hello");
        System.out.println(startsWithJava);

        boolean equals = s.equals("Hello, Java");
        System.out.println(equals);
    }
}
