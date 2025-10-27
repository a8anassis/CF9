package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * Λαμβάνει από τον χρήστη ένα ποσό (ακέραιος) σε ευρώ και το
 * μετατρέπει σε δολάρια ΗΠΑ με βάση μία ισοτιμία. Για παράδειγμα,
 * αν ο χρήστης δώσει 100 ευρώ και η ισοτιμία είναι 1 Euro = 99 USA cents,
 * τότε τα συνολικά USA cents είναι 9985 και αυτό αντιστοιχεί σε 99 USA Dollars
 * και 0 USA Cents.
 */
public class EuroToUsdConverter {

    public static void main(String[] args) {

        // Δήλωση και Αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        final int EURO_TO_USD_CONVERSION_RATE = 99;
        int inputEuros = 0;
        int totalUsaCents = 0;
        int usaDollars = 0;
        int usaCents = 0;

        // Data Input from the user
        System.out.println("Παρακαλώ εισάγετε ένα ποσό σε Ευρώ");
        inputEuros = scanner.nextInt();

        // Data Processing - Expressions
        totalUsaCents = inputEuros * EURO_TO_USD_CONVERSION_RATE;
        usaDollars = totalUsaCents / 100;
        usaCents = totalUsaCents % 100;

        // Data Output
        System.out.printf("%d Euros = %d USD dollars και %d USD Cents\n", inputEuros, usaDollars, usaCents);
    }
}
