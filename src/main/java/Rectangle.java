public class Rectangle {

    private Point upperLeft;
    private Point bottomRight;



    public Rectangle(Point upperLeft, Point bottomRight) {
        this.upperLeft = upperLeft;
        this.bottomRight = bottomRight;
    }

    public Rectangle() {
        upperLeft = new Point();
        bottomRight = new Point();
    }

    public Point getUpperLeft() {
        return upperLeft;
    }

    public Point getBottomRight() {
        return bottomRight;
    }

    public void setUpperLeft(Point upperLeft) {
        this.upperLeft = upperLeft;
    }
}
