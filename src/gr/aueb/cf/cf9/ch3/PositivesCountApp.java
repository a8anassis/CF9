package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Count the number of positive numbers.
 * How many loops will be needed is a case that
 * happens @runtime.
 */
public class PositivesCountApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int positives = 0;

        System.out.println("Please enter a number: ");
        num = scanner.nextInt();

        // Διαβάζει μέχρι να βρει αρνητικό ακέραιο (sentinel)
        while (num >= 0) {
            positives++;
            System.out.println("Please enter a number:");
            num = scanner.nextInt();
        }

        System.out.println("The count of positive numbers is: " + positives);
    }
}
