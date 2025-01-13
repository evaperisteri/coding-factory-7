package gr.aueb.cf.ch14;

public class Point2D extends Point{

    private double y;

    public Point2D(){
        super();   //super= δεικτης για το parent instance super(): καλει τον default constructor της σουπερκλάσης point
        y=0;
    }

    public Point2D(double x, double y) {
        super(x); //καλει τον υπερφορτωμενο constructor της point
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return  super.toString() + "(" + y + ")";
    }

    @Override
    public void movePlus10() {
        super.movePlus10();
        y+=10;
    }

    //liskov substitution principle αυτη η μεθοδος μπορει να γινει ειτε προστατευμένη ειτε δημοσια. οχι ιδιωτικη
    @Override
    protected void movePlusOne() {
        super.movePlusOne();
        y+=1;
    }
}

