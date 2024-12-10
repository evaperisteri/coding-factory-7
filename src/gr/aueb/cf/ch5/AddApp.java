package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * ypologizei athroisma 2 akaireon me xrhsh me8odwn
 */
public class AddApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int sum = 0;
        int sub = 0;

        System.out.println("Please enter two integers");
        a = scanner.nextInt();
        b = scanner.nextInt();

        sum = add(a,b);
        sub = sub(a,b);

        System.out.println(sum);
        System.out.println(sub);
    }

    /**
     * Adds two integers
     * @param a the first integer
     * @param b the second integer
     * @return the sum of he two
     */
    public static int add(int a, int b){
//        int result = 0;
//        result = a + b;
//        return result;

        return a + b;
    }

    /**
     * subtracts two integers
     * @param a first integer to subtract from
     * @param b second to be subtracted
     * @return the subtraction of a-b
     */
    public static int sub(int a, int b){
        return a - b;
    }
}
