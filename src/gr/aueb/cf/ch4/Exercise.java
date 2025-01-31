package gr.aueb.cf.ch4;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("please give me a number");

        for(int i = 1; i <= num; i++){
            System.out.print("*");
        }
        System.out.println();
        for(int i = 1; i <= num; i++){
            System.out.println("*");
        }
        System.out.println();
        for(int i = 1; i <= num; i++){
            for (int j = 1; j<num; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
        System.out.println();
        for(int i = 1; i <= num; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 1; i<= num; i++) {
            for (int j = num; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
