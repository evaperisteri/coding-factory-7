package gr.aueb.cf.ch7;

import java.util.Scanner;

/**
 * μετατρεπει ενα string σε ακεραιο
 */
public class ParseIntApp {
    public static void main(String[] args) {
      Scanner in =  new Scanner(System.in);
      int num = 0;
      String s;
        System.out.println("Please insert an int");
        s = in.nextLine();
        num = Integer.parseInt(s);

        System.out.println(num);
    }
}
