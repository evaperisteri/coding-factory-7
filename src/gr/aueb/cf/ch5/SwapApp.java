package gr.aueb.cf.ch5;

/**
 *
 */
public class SwapApp {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.printf("a=%d, b=%d\n", a, b);
        swap(a,b);
        System.out.printf("a=%d, b=%d\n", a, b);
    }

    /**
     * Mutually exchanges values of
     * two input Variables
     * @param a the first input
     * @param b the second input
     */
    public static void swap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }
}
