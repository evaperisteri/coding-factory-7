package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογιζει το αθροισμα των αρτιων από το 2 μέχρι το όριο που δινει ο χρηστης
 */
public class SumOfEvens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;
        int sum = 0;
        int i = 2;

        System.out.println("Insert upper limit:");
        inputNum = scanner.nextInt();

        while (i <= inputNum) {
            sum += i;
            i += 2;
        }

        System.out.println("the sum of even numbers up to " + inputNum + " is " + sum);
    }
}
