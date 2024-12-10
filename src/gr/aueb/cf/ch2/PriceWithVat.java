package gr.aueb.cf.ch2;

import java.util.Scanner;
/**
 * calculates the price with vat 24%
 */
public class PriceWithVat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double VAT_RATE = 0.24;
        double inputPrice = 0.0;
        double priceWithVat = 0.0;
        double vat = 0.0;

        System.out.println("Please insert the price");
        inputPrice = sc.nextDouble();
        vat = inputPrice * VAT_RATE;
        priceWithVat = inputPrice + vat;

        // το .2 οριζει μονο 2 δεκαδικά
        System.out.printf("Price: %.2f, Vat: %.2f, Price with vat: %.2f", inputPrice, vat, priceWithVat);
    }
}
