package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Εμφανίζει επαναληπτικά ένα μενού με πεντε
 * επιλογές, το οποίο επαναλαμβάνεται μέχρι ο χρήστης να
 * δώσει τον αριθμό 5. Για κάθε επιλογή από 1 – 4
 * εμφανίζεται feedback
 * αν ο χρήστης δώσει αριθμό < 0 ή > 5 βγαινει κατάλληλο μήνυμα.
 */
public class ExcersizeSecond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("παρακαλώ επιλέξτε");
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Ενημέρωση");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Επιλέξατε Εισαγωγή");
            } else if (choice == 2) {
                System.out.println("Επιλέξατε Διαγραφή");
            } else if (choice == 3) {
                System.out.println("Επιλέξατε Ενημέρωση");
            } else if (choice == 4) {
                System.out.println("Επιλέξατε Αναζήτηση");
            } else if (choice == 5){
                System.out.println("bye!");
            }
            else {
                System.out.println("Άκυρη επιλογή. Επιλέξτε από 1 μέχρι 5. Το 5 για έξοδο");
            }

        } while (choice != 5);
    }
}