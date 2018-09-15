import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class DayOfWeek {

    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in); // Alt + Enter

        System.out.print("Enter day (1..7): ");
        int day = scanner.nextInt();

        // Validation
        if (day < 1 || day > 7) {
            System.out.println("Illegal day");
            System.exit(-1);
        }

        // BL
        String dayType;
        if (day <= 5) {
            dayType = "weekday";
        } else {
            dayType = "weekend";
        }

//        String dayType2 = (day <= 5) ? "weekday" : "weekend";

        // Output
        System.out.println(dayType);
    }
}
