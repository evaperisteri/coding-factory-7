package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογιζει το αθροισμα των ψηφίων ενός ακεραίου
 * π.χ. το αθροισμα των ψηφιων του 123 είναι 6.
 */
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;
        int sum = 0;
        int tempNum = 0;
        int rightDigit = 0;

        System.out.println("Enter a positive integer:");
        inputNum = scanner.nextInt();

        tempNum = inputNum;
        while (tempNum > 0) {
                rightDigit = tempNum % 10;
                sum = sum + rightDigit;
                tempNum = tempNum / 10;
            }
        System.out.println("The sum o digits of " + inputNum + " is " + sum);
    }
}
