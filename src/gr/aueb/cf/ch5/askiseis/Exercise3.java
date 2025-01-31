package gr.aueb.cf.ch5.askiseis;

public class Exercise3 {
    public static void main(String[] args) {
        int x = 5;
        int y = square(x);
        System.out.println(y);
    }

    public static int square(int b) {
        int a = b * b;
        return a;
    }
}
