package gr.aueb.cf.cf9.ch3;

public class SpecialCasesWhile {

    public static void main(String[] args) {
        int i = 1;

        while (i < 0) {
            System.out.println("Never gets into this loop");
            i++;
        }

        while (i <= 1) {
            System.out.println("Only one iteration");
            i++;
        }

        while (true) {
            System.out.println("Infinite loop");
        }
    }
}
