package gr.aueb.cf.cf9.ch2;

/**
 * Προσθέτει δύο ακεραίους και το αποτέλεσμα
 * δημιουργεί υπερχείλιση (overflow).
 */
public class OverflowApp {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        int num1 = Integer.MAX_VALUE;
        int num2 = 1;
        int result = 0;

        // Εντολές
        result = num1 + num2;

        // Εκτύπωση αποτελέσματος
        System.out.println("Το αποτέλεσμα είναι: " + result);
    }
}
