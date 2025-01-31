package gr.aueb.cf.ch5.askiseis;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        System.out.println("please enter 3 integers:");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int result = findMax(x, y, z);
        System.out.printf("Max value between %d, %d, %d is: %d!", x, y, z, result);
    }

    public static int findMax(int a, int b, int c) {
        if (c > Math.max(a, b)){
            return c;
        }
        return  Math.max(a,b);
    }
}
