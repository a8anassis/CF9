package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει ένα ακέραιο που συμβολίζει μία
 * θερμοκρασία. Και το πρόγραμμα υπολογίζει αν η
 * θερμοκρασία < 0 τότε μια μεταβλητή γίνεται true,
 * αλλιώς γίνεται false
 */
public class TemperatureApp {

    public static void main(String[] args) {

        // Δήλωση και Αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int temperature = 0;
        boolean isTempBelowZero = false;

        // Εισαγωγή Δεδομένων
        System.out.println("Παρακαλώ εισάγεται μία θερμοκρασία");
        temperature = scanner.nextInt();

        // Επεξεργασία των δεδομένων
        isTempBelowZero = temperature < 0;

        // Εκτύπωση των αποτελεσμάτων
        System.out.println("Η θερμοκρασία είναι μικρότερη από 0: " + isTempBelowZero);
    }
}
