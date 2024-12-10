package gr.aueb.cf.ch8;

import java.util.Scanner;

public class SimpleBank {
static double balance = 500;
static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {
        try {
            deposit(100);
        } catch (Exception e) {
            System.out.println("An error happened. try again");
        }
    }
    // δεν μπαινει υποχρεωτικα στην επικεφαλιδα γιατι ειναι runtime
    public static void deposit(double amount) throws Exception {
        try {
            if(amount<=0) {
                throw new Exception("Amount must be positive");
            }
            balance += amount;
            System.out.println("Successfully deposited " + amount);
        } catch (Exception e) {
            System.err.println("Error. " + e.getMessage());
            throw e;
        }
    }
//    public static void main(String[] args) {
//        deposit(100);
//    }
//// δεν μπαινει υποχρεωτικα στην επικεφαλιδα γιατι ειναι runtime
//    public static void deposit(double amount) {
//        try {
//            if(amount<=0) {
//                throw new IllegalArgumentException("Amount must be positive");
//            }
//            balance +=amount;
//            System.out.println("Succesfully deposited " + amount);
//        } catch (IllegalArgumentException e) {
//            System.err.println("Error. " + e.getMessage());
//            throw e;
//        }
//    }
}
