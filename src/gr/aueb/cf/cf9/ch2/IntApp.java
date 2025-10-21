package gr.aueb.cf.cf9.ch2;

public class IntApp {

    public static void main(String[] args) {
        System.out.printf("Type: int  , Size: %2d bits, Min: %,d, Max: %,d%n", Integer.BYTES * 8, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("Type: byte , Size: %2d bits, Min: %d, Max: %d%n", Byte.BYTES * 8, Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("Type: short, Size: %2d bits, Min: %,d, Max: %,d%n", Short.BYTES * 8, Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("Type: long , Size: %2d bits, Min: %,d, Max: %,d%n", Long.BYTES * 8, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}
