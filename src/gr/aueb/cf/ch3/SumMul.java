package gr.aueb.cf.ch3;

/**
 * calculate the sum and mul of the first ten integers.
 */
public class SumMul {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        while (i <= 10) {
            sum = sum + i;
            //sum += i κανει το ιδιο^
            i++;
        }
        int j = 1;
        int mul = 1;

        while (j<= 10) {
            mul = mul * j;
            j++;
        }
    }
}
