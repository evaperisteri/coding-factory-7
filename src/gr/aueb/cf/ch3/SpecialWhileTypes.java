package gr.aueb.cf.ch3;

import java.util.Scanner;

public class SpecialWhileTypes {
    public static void main(String[] args) {
        int i = 1;
        Scanner in = new Scanner(System.in);
        int num = 0;

        while ((num = in.nextInt()) >= 0);
        while(i<=0) {
            System.out.println("ΔΕΝ ΕΚΤΕΛΕΙΤΑΙ ΚΑΜΙΑ ΦΟΡΑ");
            i++;
        }
        while (i<1) {
            System.out.println("ΔΕΝ ΕΚΤΕΛΕΙΤΑΙ ΚΑΜΙΑ ΦΟΡΑ");
            i++;
        }
        while (i<=1) {
            System.out.println ("ΕΚΤΕΛΕΙΤΑΙ ΜΙΑ ΦΟΡΑ");
            i++;
        }
//        while (true) {
//            System.out.println ("i AM ETERNAL");
//        }
        //ΕΚΤΕΛΕΙΤΑΙ ΓΙΑ ΠΑΝΤΑ

    }
}
