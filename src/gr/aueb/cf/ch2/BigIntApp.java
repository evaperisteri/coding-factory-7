package gr.aueb.cf.ch2;

import java.math.BigInteger;

public class BigIntApp {
    public static void main(String[] args) {
        // declarations
        BigInteger bigNum1 = new BigInteger("123345565851555555151515458866");
        BigInteger bigNum2 = new BigInteger("234554585678956256655556");
        BigInteger result;
        // commands
        result = bigNum1.add(bigNum2);

        // printing the results
        System.out.printf("%,d", result);

    }
}
