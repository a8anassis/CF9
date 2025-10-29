package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Count the number of iterations.
 * When the user inserts -1,
 * the while-do loop will stop.
 */
public class IterationsCountApp {

    public static void main(String[] args) {

        // Δήλωση και Αρχικοποίηση Μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int iterations = 0;

        // Είσοδος Δεδομένων
        System.out.println("Please enter a number: ");
        num = scanner.nextInt();

       // Επεξεργασία - while-do
        while ((num = scanner.nextInt()) != -1) {
            iterations++;
            System.out.println("Please enter a number:");
            // num = scanner.nextInt();
        }

        // Εκτύπωση Αποτελεσμάτων
        System.out.println("The count of iterations is: " + iterations);
    }
}
