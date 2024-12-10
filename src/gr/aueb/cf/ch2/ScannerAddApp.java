package gr.aueb.cf.ch2;

import java.util.Scanner;

import static java.lang.System.in;

/**
 * scanner Demo. reads two integers from standard inpput (keyboard)
 * and calculates the result
 */
public class ScannerAddApp {
    public static void main(String[] args) {

        //δήλωση κι αρχικοποιηση μεταβλητών
        int num1 = 0;
        int num2 = 0;
        int sum = 0;
        Scanner in = new Scanner(System.in);

        //Εντολές
        System.out.println("Please insert two integers");
        num1 = in.nextInt();
        num2 = in.nextInt();
        sum = num1 + num2;

        //Εκτυπωση αποτελεσμάτων
        System.out.printf("Το άθροισμα των %d και %d είναι %d", num1, num2, sum);



    }
}
