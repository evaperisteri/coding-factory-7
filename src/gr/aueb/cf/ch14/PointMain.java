package gr.aueb.cf.ch14;

public class PointMain {
    public static void main(String[] args) {
//        Point point = new Point();
//        Point2D point2d = new Point2D();
//        Point3D point3d = new Point3D();

        Point p1 = new Point();
        Point p2 = new Point2D();
        Point p3 = new Point3D();

        p2.movePlusOne();
        p2.movePlus10();

        p3.movePlus10();

        ((Point2D) p2).setY(12); //typecast το p2 από point σε point2d

//        doMovePlusTen(point);
//        doMovePlusTen(point2d);
//        doMovePlusTen(point3d);
    }

    //πολυμορφικη μεθοδος (οι static δεν γινονται πολυμορφικες)
    // at compile time θα εφερνε μονο την moveplus10 της Point
    // at runtime --late binding βλεπει μια στακ από τις override Point, Point2d, Point3d
    public static void doMovePlusTen(Point point) {
        point.movePlus10();
    }

    public static void doPrint(Point point) {
        System.out.println(point.toString());
    }
}
