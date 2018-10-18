package Geometry;

public class Point {
    public double x;
    public  double y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Geometry.Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double distance(Point p){
        double x2 = (this.getX() - p.getX())*(this.getX() - p.getX());
        double y2 = (this.getY() - p.getY())*(this.getY() - p.getY());
        return Math.sqrt(x2 + y2);
    }
}
