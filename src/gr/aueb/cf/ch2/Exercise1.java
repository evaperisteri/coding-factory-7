package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * μετατρέπει ακέραιες θερμοκρασίες Φαρενάιτ
 * (Fahrenheit) στην κλίμακα Κελσίου.
 */
public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tempF = 0;
        int tempC = 0;

        System.out.println("Please insert the temperature(F)");
        tempF = scanner.nextInt();

        tempC = (5 * (tempF - 32))/9;

        System.out.printf("The temperature %d Fahrenheit is %d Celsius", tempF, tempC);
    }
}
