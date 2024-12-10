package gr.aueb.cf.ch2;

/**
 * calculates the sum of two integers
 * and the result is printed at console
 * (standard output)
 */
public class AddApp {
    public static void main(String[] args) {
        //δηλωση και αρχικοποιηση μεταβλητών
        int num1 = 5;
        int num2 = 12;
        int result = 0;

        //entoles
        result = num1 + num2;

        //ektupwsi apotelesmatos
        System.out.println("το αποτέλεσμα είναι:" + result);
        System.out.println("Το αθροισμα των" + num1 + "," + num2 + "είναι ίσο με:" + result);
        System.out.printf("το άθροισμα των %d, %d είναι ίσο με %d\n", num1, num2, result);

    }
}
