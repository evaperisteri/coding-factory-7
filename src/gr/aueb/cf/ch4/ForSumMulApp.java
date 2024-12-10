package gr.aueb.cf.ch4;

/**
 * Calculates sum and mul of the 10 first intigers
 */
public class ForSumMulApp {
    public static void main(String[] args) {
        int sum = 0;
        int mul = 0;

        for (int i=1; i <= 10; i++) {
            sum += i; //sum = sum +1
            mul *= i;
        }

        System.out.println("Sum: " + sum);
        System.out.println("Mul: " + mul);
    }
}
