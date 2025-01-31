package gr.aueb.cf.ch5.askiseis;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {

        System.out.println("please enter an integer");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if(isPrime(a)) {
            System.out.println(a + " is a prime number");
        }
        else {
            System.out.println(a + " is a non-prime number");
        }
    }

    public static boolean isPrime (int a) {
        if(a <= 1) {
            return false;
        }
        for(int i = 2;i <= a/2; i++) {
            if((a % i) == 0)
                return false;
        }
        return true;
    }
}
