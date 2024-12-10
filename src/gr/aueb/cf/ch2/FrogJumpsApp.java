package gr.aueb.cf.ch2;

/**
 * A SMALL FROG WANTS TO GO TO THE OTHER SIDE OF THE ROAD
 * TH FROG IS CURRENTLY LOCATED AT POSITION X AND WANTS TO GO AT A
 * POSITION GRETER OR EQUAL TO Y. THE SMALL FROG JUMPS A FIXED DISTANCE, D.
 * FIND THE MINIMUM NUMBER OF JUMPS.
 * x = 10 THESI ENARKSIS
 * y = 85 THESI STOXOS
 * D = 30 ALMA
 *
 * juMps = 3
 * 10 + 30 = 40
 * 40 + 30 = 70
 * 70+ 30 = 100
 */
public class FrogJumpsApp {
    public static void main(String[] args) {
        int target = 85;
        int start = 10;
        int hop = 30;
        int jumps = 0;

        //
        jumps = (int) Math.ceil((target - start) / (double) hop);

        System.out.println("Jumps: " + jumps);
    }
}
