public class Point {
    private double x;
    private double y;

    private static final double X_DEFAULT = 0.0;
    private static final double Y_DEFAULT = 0.0;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this.x=X_DEFAULT;
        this.y=Y_DEFAULT;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}
