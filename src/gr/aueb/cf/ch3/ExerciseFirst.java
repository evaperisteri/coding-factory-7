package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * αποφαίνεται αν
 * ένα έτος είναι δίσεκτο ή όχι
 */
public class ExerciseFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputYear = 0;
        int tempYear = 0;
        boolean isLeapYear = false;
        boolean isDivededByFOur = false;
        boolean isDividedByHunred = false;
        boolean isDividedbyFourHundred = false;

        System.out.println("Please insert a year");
        inputYear = scanner.nextInt();
        tempYear = inputYear;

        isDivededByFOur = tempYear % 4 == 0;
        isDividedByHunred = tempYear % 100 != 0;
        isDividedbyFourHundred = tempYear % 400 == 0;

        isLeapYear = (isDivededByFOur && isDividedByHunred)||isDividedbyFourHundred;
        System.out.println("Year " + inputYear + " is a leap year: " + isLeapYear);
    }
}
