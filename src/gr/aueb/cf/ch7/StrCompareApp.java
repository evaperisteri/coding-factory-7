package gr.aueb.cf.ch7;

/**
 * compares two strings for less than (lt), grater than (g) or equal (eq)
 */
public class StrCompareApp {
    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = "ATHENS";

        if (s1.compareTo(s2)>0) {
            System.out.println( "s1>s2");
        } else if (s1.compareTo(s2) <0) {
            System.out.println("s1<s2");
        } else { //s1.comparesTo s2
            System.out.println("s1.equals(s2) == true");
        }


        if (s1.compareToIgnoreCase(s2)>0) {
            System.out.println( "s1>s2");
        } else if (s1.compareToIgnoreCase(s2) <0) {
            System.out.println("s1<s2");
        } else { //s1.comparesToIgnoreCase s2
            System.out.println("s1.equals(s2) == true");
        }
    }
}
