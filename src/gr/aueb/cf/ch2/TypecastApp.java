package gr.aueb.cf.ch2;

/**
 * typecast demo
 */
public class TypecastApp {
    public static void main(String[] args) {
        int num1 = 10; //int literals -> int -> 32 bit
        long num2 = 20L; //me to L anabathmizetai to megethos

        num1 = (int) num2;
    }
}
