package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει δύο τιμές, αριθμητή και
 * παρονομαστή και το πρόγραμμα υπολογίζει το
 * πηλίκο, επαναληπτικά.
 *
 * Αν ο αριθμητής είναι 0 τότε το πρόγραμμα διακόπτεται.
 * Αν ο παρονομαστής είναι 0, τότε η διαδικασία επαναλαμβάνεται.
 */
public class DivisionApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        while (true) {
            System.out.println("Please enter a numerator: ");
            numerator = scanner.nextInt();

            if (numerator == 0) {
                System.out.println("Numerator is 0. Quiting ....");
                break;
            }

            System.out.println("Please enter a denominator: ");
            denominator = scanner.nextInt();

            if (denominator == 0) {
                System.out.println("Can not dived by zero.");
                continue;
            }

            result = numerator / denominator;
            System.out.println("Result: " + result);
        }
    }
}
