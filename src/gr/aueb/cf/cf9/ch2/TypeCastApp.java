package gr.aueb.cf.cf9.ch2;

public class TypeCastApp {

    public static void main(String[] args) {
        long myLong = (long) 2_147_483_647;
        int myInt = (int) myLong;
        System.out.println("My long is: " + myLong);
        System.out.println("My int is: " + myInt);
    }
}
