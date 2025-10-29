package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Calculates the power of a number, base^power.
 * base^power = base * base * base * ... * base
 * (power φορές)
 */
public class PowerApp {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 1;
        int i = 1;

        // Είσοδος Δεδομένων και αντιστοίχιση σε μεταβλητές
        System.out.println("Παρακαλούμε εισάγετε το base και το power");
        base = scanner.nextInt();
        power = scanner.nextInt();

        // Επεξεργασία Δεδομένων - While - do
        while (i <= power) {
            result *= base;     // result = result * base
            i++;
        }

        // Εκτύπωση των αποτελεσμάτων
        System.out.printf("%d ^ %d = %d\n", base, power, result);
    }
}
