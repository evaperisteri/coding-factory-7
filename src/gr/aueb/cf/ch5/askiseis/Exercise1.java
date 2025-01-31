package gr.aueb.cf.ch5.askiseis;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            printMenu();
            choice = scanner.nextInt();

            if (!isChoiceValid(choice)) {
                System.out.println("Λαθος επιλογή");
                continue;
            }
            System.out.println("επιλέξτε το n");
            starChoice(choice);
        } while (choice!=6);
    }

    public static void printMenu(){
        System.out.println();
        System.out.println("Ποια ειναι η επιλογή σας;");
        System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
        System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
        System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
        System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1 έως n");
        System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n έως 1");
        System.out.println("6. Έξοδος από το πρόγραμμα");
    }

    public static boolean isChoiceValid (int choice) {
        return choice >=1 && choice <=6;
    }

    public static void starChoice(int choice){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();


        switch (choice) {
            case 1:
                for(int i = 1; i <= num; i++){
                    System.out.print("*");
                }break;
            case 2:
                for(int i = 1; i <= num; i++){
                    System.out.println("*");
                }break;
            case 3:
                for(int i = 1; i <= num; i++){
                    for (int j = 1; j<num; j++) {
                        System.out.print("*");
                    }
                    System.out.println("*");
                }break;
            case 4:
                for(int i = 1; i <= num; i++) {
                    for (int j = 1; j<=i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }break;
            case 5:
                for(int i = 1; i<= num; i++) {
                    for (int j = num; j >= i; j--) {
                        System.out.print("*");
                    }
                    System.out.println();
                }break;
            case 6:
                System.out.println("Έξοδος από το πρόγραμμα");
                break;
            default:
                System.out.println("Λάθος επιλογή");
                break;

        }
    }
}
