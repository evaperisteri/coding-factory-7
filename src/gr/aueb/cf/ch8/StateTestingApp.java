package gr.aueb.cf.ch8;

import java.util.Scanner;

public class StateTestingApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;
//γλιτωνουμε input missmatch με την .has nextint (κανει state test) ελεγχει προτου τρεξει
// το in.nextLine() παει στην επόμενη τιμη
        while (!in.hasNextInt()) {
            System.out.println("Error. Input must be int. please insert numerator");
            in.nextLine();
        }
        numerator= in.nextInt();

        while (!in.hasNextInt()) {
            System.out.println("Error. Input must be int. please insert denominator");
            in.nextLine();
        }
        denominator= in.nextInt();

        if (denominator == 0) { //state test
            System.out.println("Error. Denominator must not be zero");
            System.exit(1);
        }

        result = numerator / denominator;
        System.out.printf("%d / %d = %d\n", numerator, denominator, result);
    }
}
