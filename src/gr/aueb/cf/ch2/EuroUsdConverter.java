package gr.aueb.cf.ch2;

import java.util.Scanner;
/**
 * μετατροπή ευρώ σε αμερικάνικά δολλάρια
 */
public class EuroUsdConverter {
    public static void main(String[] args) {

        //δήλωση κι αρχικοποιηση μεταβλητών
        int inputEuros = 0;
        int totalUsaCents = 0;
        int usaDollars = 0;
        int usaCents = 0;
        final int PARITY = 99;
        Scanner in = new Scanner(System.in);

        //Εντολές
        System.out.println("please insert an integer amount Euro");
        inputEuros = in.nextInt();
        totalUsaCents = inputEuros * PARITY;
        usaDollars = totalUsaCents / 100;
        usaCents = totalUsaCents % 100;

        //Εκτυπωση αποτελεσμάτων
        System.out.printf("%d \u20AC = %d \u0024, %d σεντς", inputEuros, usaDollars, usaCents);
    }
}
