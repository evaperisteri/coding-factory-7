package gr.aueb.cf.ch14.model;

import java.util.Random;

public class Point {
    private int x;
    private int y;
//    private constructor
    private Point(){

    }
    private Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    //static factory methods δινουν περισσοτερα απο ενα instances και παιρνουν καλυτερα ονοματα από τουσ constructors
    public static Point getInstance() {
        return new Point();
    }

    public static Point getRandomPoint(){
        Random random = new Random(System.currentTimeMillis());
//        Random random = new Random(System.nanoTime()); κι αυτο αλλαζει τισ ψευδοτυχαιεσ ακολουθίες
        return new Point (random.nextInt(10), random.nextInt(10));
//        ((μαχ-μιν +1) + μιν)
    }
}
