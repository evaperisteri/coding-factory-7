package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * o xrhsths tha dinei
 * 1. τοθσ συνολικουσ βαθμουσ μαθηματων
 * 2. το πληθοσ των μΑθητων
 *
 * θα υπολογιζει τον μεσο ορο και θα χαρακτηριζει "αριστα"
 * αν ο μ.ο. ειναι >=7 και Καλώς αν ο μ.ο ειναι >= 5
 * και "αποτυχια" αν ο μ.ο <5
 */
public class GradesApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMarks = 0;
        int coursesCounts = 0;
        int average = 0;

        System.out.println("please insert total marks");
        totalMarks = scanner.nextInt();

        if (totalMarks <=0) {
            System.out.println("Total marks must not be zero.");
            System.exit(1);
        }
        System.out.println("Please insert courses count");
        coursesCounts = scanner.nextInt();

        if (coursesCounts <= 0){
            System.out.println("courses count must not be negative or zero");
            System.exit(1);
        }

        average = totalMarks/coursesCounts;

        if (average>10) {
            System.out.println("Error. the average is not valid, must be less or equal to 10");
            System.exit(1);
        }

        if (average >= 9) {
            System.out.println("Excellent");
        } else if (average >=7) {
            System.out.println("Very Good");
        } else if (average >= 5) {
            System.out.println("Good");
        } else  { // Υπονοειται average < 5
            System.out.println("Failure");
        }
    }
}
