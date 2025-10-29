package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Επαναληπτικά ο χρήστης εισάγει ακεραίους και
 * προσπαθεί να μαντέψει το Secret.
 */
public class SecretIterativeApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SECRET = 42;
        int num = 0;

        while (true) {
            System.out.println("Please guess the secret number: ");
            num = scanner.nextInt();

//            if (num == SECRET) {
//                System.out.println("You guessed the secret number!");
//                break;
//            } else {
//                System.out.println("Try again!");
//            }

            if (num != SECRET) {
                System.out.println( "Try again!");
                continue;
            }

            System.out.println("You guessed the secret number!");
            break;
        }
    }
}
