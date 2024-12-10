package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * διαβάζει
 * από τον χρήστη 3 ακέραιους αριθμούς
 * που αναπαριστούν ημέρα, μήνα, έτος
 * και την εμφανίζει σε μορφή:
 *  ΗΗ/ΜΜ/ΕΕ
 */
public class AskisiDeuteri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputYear = 0;
        int inputMonth = 0;
        int inputDay = 0;
        int shortYear = 0;

        System.out.println("Please type a day");
        inputDay = scanner.nextInt();
        System.out.println("Please type a month");
        inputMonth = scanner.nextInt();
        System.out.println("Please type a year");
        inputYear = scanner.nextInt();
        shortYear = inputYear % 100;

        System.out.printf("The date is: %02d/%02d/%d", inputDay, inputMonth, shortYear);
    }
}
