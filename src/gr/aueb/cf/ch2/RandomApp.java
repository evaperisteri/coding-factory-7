package gr.aueb.cf.ch2;

/**
 * random arithmo [0,1)
 */
public class RandomApp {
    public static void main(String[] args) {
      int die = (int) (Math.random() * 6) + 1;

      System.out.println(die);
    }
}
