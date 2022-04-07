public class Rectangle {

    private Point upperLeft;
    private double bottomRight;

   private static final double BOTTOM_RIGHT_POR_OMISSAO = 0.0;

    public Rectangle(Point upperLeft, double bottomRight) {
        this.upperLeft = upperLeft;
        this.bottomRight = bottomRight;
    }

    public Rectangle() {
        bottomRight = BOTTOM_RIGHT_POR_OMISSAO;
    }

    public Point getUpperLeft() {
        return upperLeft;
    }

    public double getBottomRight() {
        return bottomRight;
    }

    public void setUpperLeft(Point upperLeft) {
        this.upperLeft = upperLeft;
    }

    public void setBottomRight(double bottomRight) {
        this.bottomRight = bottomRight;
    }
}
