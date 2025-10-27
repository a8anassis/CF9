package gr.aueb.cf.cf9.ch3;

/**
 * Prints 10 horizontal stars.
 */
public class Stars10 {

    public static void main(String[] args) {
        int i = 1;
        int j = 10;

        while (i <= 10) {
            System.out.print("*");
            i++;
        }

        while (j >= 1) {
            System.out.print("*");
            j--;
        }
    }
}
