package gr.aueb.cf.ch16.sceletal2;

public class Square extends AbstractRectangle implements ISquare {

    @Override
    public double getDiagonal() {
        return (Math.pow(getWidth(), 2) + Math.pow(getHeight(), 2));
    }
}
