public class Rectangle extends Figure{

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

    @Override
    public double perimeter() {
        double ceilingSize = this.bottomRight.getX()-upperLeft.getX();
        double sideSize = this.upperLeft.getY()-this.getBottomRight().getY();
        return 2*ceilingSize+2*sideSize;
    }

    @Override
    public double area() {
        double ceilingSize = this.bottomRight.getX()-upperLeft.getX();
        double sideSize = this.upperLeft.getY()-this.getBottomRight().getY();
        return ceilingSize*sideSize;
    }
}
