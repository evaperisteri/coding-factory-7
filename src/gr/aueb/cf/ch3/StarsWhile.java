package gr.aueb.cf.ch3;

/**
 * na emfanisoume 10 orizontia asterakia
 * na ektypwsoume ena asteraki 10 fores
 */
public class StarsWhile {
    public static void main(String[] args) {
        int i = 1;
        int j = 10;
        while (i <= 10) {
            System.out.print("*");
            i++;
        }
        System.out.println();

        while (j>=1) {
            System.out.print("*");
            j--;
        }
    }

}
