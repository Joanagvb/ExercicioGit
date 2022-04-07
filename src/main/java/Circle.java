public class Circle extends Figure{
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

    public String toString(){
        return String.format("Point: %s --- Radius: %s",this.center,this.radius);
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*this.radius;
    }

    @Override
    public double area() {

        return Math.PI*Math.pow(this.radius,2);
    }
    public double mPerimetro(){
        return 2*Math.PI*this.radius;
    }
    public double mArea() {

        return Math.PI*Math.pow(this.radius,2);
    }
}
