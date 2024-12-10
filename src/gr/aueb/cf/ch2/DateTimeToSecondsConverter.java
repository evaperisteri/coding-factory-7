package gr.aueb.cf.ch2;

import java.util.Locale;
import java.util.Scanner;

/**
 * Μετατρέπει ημέρες, ώρες, λεπτά, δευτερόλεπτα σε συνολικά δευτερόλεπτα.
 * ο χρήστης δίνει τα δεδομένα και εκτυπώνεται το τελικό αποτέλεσμα
 */
public class DateTimeToSecondsConverter {

    public static void main(String[] args) {

        //δηλώσεισ
        Scanner in = new Scanner(System.in);
        int inputDays = 0;
        int inputHours = 0;
        int inputMinutes = 0;
        int inputSeconds = 0;
        int totalSeconds = 0;
        final int SECS_PER_DAY = 3600 * 24;
        final int SECS_PER_HOUR = 3600;
        final int SECS_PER_MIN = 60;

        //Εντολές
        System.out.println("please insert days, hours, minutes and seconds");
        inputDays = in.nextInt();
        inputHours = in.nextInt();
        inputMinutes = in.nextInt();
        inputSeconds = in.nextInt();

        totalSeconds = (inputDays * SECS_PER_DAY) + (inputHours * SECS_PER_HOUR) + (inputMinutes * SECS_PER_MIN) + inputSeconds;

        //Εκτύπωση αποτελέσματος
        System.out.printf(Locale.US,"Total Seconds: %,d", totalSeconds);

    }}
