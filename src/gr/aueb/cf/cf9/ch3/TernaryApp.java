package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Τριαδικός τελεστής demo. Υπολογίζει τον μικρότερο
 * μεταξύ δύο ακεραίων που δίνει ο χρήστης.
 */
public class TernaryApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int min = 0;

        System.out.println("Please enter two numbers: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        if (num1 < num2) {
            min = num1;
        } else {            // if (num1 >= num2)
            min = num2;
        }

        // Conditional Assignment
        min = num1 < num2 ? num1 : num2;        // syntactic sugar

        System.out.println("The smallest number is: " + min);
    }
}
