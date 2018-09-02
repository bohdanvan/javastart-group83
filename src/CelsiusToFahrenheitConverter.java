/**
 * @author bvanchuhov
 */
public class CelsiusToFahrenheitConverter {

    public static void main(String[] args) {
        double celsius = -10; // Input: any valid Celsius temperature

        double fahrenheit = celsius*9/5 + 32;; // Your formula

        System.out.println(celsius + " °C -> " + fahrenheit + " °F");
    }
}

// Output:
// 0.0 °C -> 32.0 °F
// 20.0 °C -> 68.0 °F
// -10.0 °C -> 14.0 °F
