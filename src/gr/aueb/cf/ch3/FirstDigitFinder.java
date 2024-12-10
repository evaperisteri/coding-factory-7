package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Briskei to prwto aristera (to pio shmantiko stoixeio) enos akeraiou
 *
 */
public class FirstDigitFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int tempNum = 0;

        System.out.println("Enter a positive number");
        num = scanner.nextInt();

        tempNum = num;
        while (tempNum >= 10) {
            tempNum /= 10;
        }
        System.out.println("the first digit of " + num + " is " );
    }
}
