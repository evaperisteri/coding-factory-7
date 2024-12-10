package gr.aueb.cf.ch5;
/**
 * εμφανιζει ενα μενου επιλγων και ο χρηστησ
 * επιλεγει ενα menu item και στη συνεχεια
 * αναλογα με την επιλογη, εκτελειται καποια ενεργεια.
 */

import java.util.Scanner;

public class MenuApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            printMenu();
            choice = scanner.nextInt();

            if (!isChoiceValid(choice)) {
                System.out.println("Error. Choice not valid.");
                continue;
            }

            doOnChoice(choice);
        } while (choice != 5);

    }

    public static void printMenu() {
        System.out.println("Επιλεξτε ένα από τα παρακάτω:");
        System.out.println("1. ΕΙΣΑΓΩΓΗ");
        System.out.println("2. ΔΙΑΓΡΑΦΗ");
        System.out.println("3. ΑΝΑΖΗΤΗΣΗ");
        System.out.println("4. ΕΝΗΜΕΡΩΣΗ");
        System.out.println("5. ΕΞΟΔΟΣ");
    }

    public static boolean isChoiceValid (int choice) {
        return choice >=1 && choice <=5;
    }

    public static void doOnChoice (int choice) {
        switch (choice) {
            case 1:
                System.out.println("Εισαγωγή process");
                break;
            case 2:
                System.out.println("Διαγραφή process");
                break;
            case 3:
                System.out.println("Αναζήτηση process");
                break;
            case 4:
                System.out.println("Ενημέρωση process");
                break;
            case 5:
                System.out.println("Εξοδος");
                break;
            default:
                System.out.println("Wrong choice");
                break;
        }
    }
}
