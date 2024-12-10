package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 *  Λαμνβάνει από το χρηστη ως ινπουτ από το χρήστη ένα διψήφιο ακέραιο και
 *  να εκτυπώνει το άθροισμα των ψηφίων του.
 *  για παράδειγμα, αν ο χρήστης δώσει τον ακεραιο 15,
 *  το αποτέλεσμα θα πρέπει αν αείναι 1+5 = 6
 */
public class DigitSumApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputnum = 0;
        int firstDigit = 0;
        int secondDigit = 0;
        int sum = 0;

        System.out.println("Δώστε έναν διψήφιο ακέραιο:");
        inputnum = in.nextInt();
        firstDigit = inputnum / 10;
        secondDigit = inputnum % 10;
        sum = firstDigit + secondDigit;

        System.out.printf("Input num: %d, Left digit: %d, Right Digit: %d, Sum: %d",
                inputnum, firstDigit, secondDigit, sum);


    }
}
