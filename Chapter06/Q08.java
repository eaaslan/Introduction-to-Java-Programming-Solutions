package homework.chapter06;

public class Q08 {

    public static void main(String[] args) {

        System.out.printf("%12s%15s%6s%12s%12s\n", "Celsius", "Fahrenheit", "|", "Celsius", "Fahrenheit");
        System.out.println("__________________________________________________________");
        for (int i = 40, j = 120; i >= 31; i--, j -= 10) {
            System.out.printf("%12d%15.2f%6s%12d%12.2f\n", i,  celsiusToFahrenheit(i), "|", j, fahrenheitToCelsius(j));
        }
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }
}
