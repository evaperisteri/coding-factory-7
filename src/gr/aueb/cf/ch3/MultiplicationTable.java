package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Δινει ως output τον πολλαπλασιασμο ενος ακεραίου που δινει ο
 * χρήστησ με όλους τους ακεραίους από το ενα έως το 10
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int i = 1;

        System.out.println("ENter an integer");
        num = scanner.nextInt();

        while (i <= 10) {
//            System.out.println("το γινόμενο του " + num + " επί το " + i + " ισούται με " + (num * i));
            System.out.printf("%d * %2d = %d\n", num, i, num, num * i);
            i++;
        }
    }
}
