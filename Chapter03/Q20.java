package homework.chapter03;

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperatures in the range between −58ºF and 41ºF: ");
        double temp = scanner.nextDouble();

        if (temp < 41 && temp > -58) {
            System.out.println("Enter the wind speed greater than or equal to 2");
            double speed = scanner.nextDouble();
            if (speed >= 2) {
                double windchill = (35.74) + (0.6215 * temp) - (35.75 * Math.pow(speed, 0.16)) + (0.4275 * temp * Math.pow(speed, 0.16));
                System.out.println("The wind-chill temperature is:" + windchill);
            } else {
                System.out.println("Speed is invalid value");
            }
        } else {
            System.out.println("Temp is invalid value");
        }
    }
}
