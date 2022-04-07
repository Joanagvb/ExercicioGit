import java.util.Objects;

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

    public String toString(){
        return String.format("(%.2f,%.2f)%n",this.x,this.y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o==null ||getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(point.x, x) == 0 && Double.compare(point.y, y) == 0;
    }


}
