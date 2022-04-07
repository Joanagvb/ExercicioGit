public class Circle {
    private Point center;
    private double radius;

    private static final double RADIUS_DEFAULT = 0.0;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Circle() {
        this.center=new Point();
        this.radius=RADIUS_DEFAULT;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void expand(double scaleFactor){
        if (this.radius >0){
            this.radius*=scaleFactor;
        }
    }
}
