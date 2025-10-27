package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * The user inserts the temperature, and the boolean status of isRaining
 * variable and calculates if it is snowing or not. If it is raining and
 * the temperature is below 0, it is snowing.
 */
public class SnowingApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperature = 0;
        boolean isRaining = false;
        boolean isSnowing = false;

        System.out.println("Παρακαλώ εισάγετε αν βρέχει (true/false)");
        isRaining = scanner.nextBoolean();
        System.out.println("Παρακαλώ εισάγετε τη θερμοκρασία");
        temperature = scanner.nextInt();

        isSnowing = isRaining && (temperature < 0);     // Short-Circuit Operator

        System.out.println("Is Snowing: " + isSnowing);
    }
}
