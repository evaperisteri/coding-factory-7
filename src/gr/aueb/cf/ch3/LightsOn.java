package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Turn lights on, if it is raining AND car is running (>100) OR is dark.
 */
public class LightsOn {
    public static void main(String[] args) {
        boolean isRaining = false;
        boolean isCarRunning = false;
        boolean isDark = false;
        boolean areLightsOn = false;
        int carSpeed;
        final int MAX_CAR_SPEED = 100;
        Scanner in = new Scanner(System.in);

        System.out.println("Insert if it is raining:");
        isRaining = in.nextBoolean();
        System.out.println("Insert if it is dark:");
        isDark = in.nextBoolean();
        System.out.println("Insert your speed: ");
        carSpeed = in.nextInt();

        isCarRunning = carSpeed > MAX_CAR_SPEED;
        areLightsOn = isRaining && (isDark || isCarRunning);
//        areLightsOn = (isRaining && isDark) || (isRaining && isCarRunning);

        System.out.println("Turn lights on " + areLightsOn);



    }
}
