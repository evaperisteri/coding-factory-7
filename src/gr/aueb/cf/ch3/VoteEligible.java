package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 *δικαιωμα ψηφου σε ηλικιες >18.
 * Ελεγχει αν μία ηλικία έχει δικαίωμα να ψηφισει
 */
public class VoteEligible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        final int VOTING_AGE = 18;
        boolean isEligible = false;

        System.out.println("Please enter your age:");
        age = scanner.nextInt();

        isEligible = age >= VOTING_AGE;
        System.out.println("you are eligible:" + isEligible);
    }
}
