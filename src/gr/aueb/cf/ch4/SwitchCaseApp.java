package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Switch / case Demo
 */
public class SwitchCaseApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do{
            System.out.println("επιλέξτε ένα από τα παρακάτω");
            System.out.println("1. one player");
            System.out.println("2. two player");
            System.out.println("3. team game");
            System.out.println("4. Quit");

            choice = scanner.nextInt();
            if (choice <1||choice>4){
                System.out.println("choose between 1-4");
                System.out.println("Try again");
                continue;
            }
//            if (choice ==1){
//                System.out.println("one player game started");
//            } else if (choice ==2){
//                System.out.println("two player game started");
//            } else if (choice ==3) {
//                System.out.println("team game started");
//            } else {
//                System.out.println("Quiting...");
//            }


            switch (choice) {
                case 1:
                    System.out.println("One-player game started");
                    break;
                case 2:
                    System.out.println("Two-player game started");
                    break;
                case 3:
                    System.out.println("Team-game started");
                    break;
                case 4:
                    System.out.println("Quitting..");
                    break;
                default:
                    System.out.println("Error in choice");
                    break;
            }
        } while (choice !=4);
    }
}
