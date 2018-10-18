package Geometry;

import Geometry.Point;

public class PointTest {
    public static void main(String[] args){
        Point p0 = new Point(1.2, 4.5);
        Point p1 = new Point();

        System.out.println("p0:" +p0);
        System.out.println("p1:" +p1);

        System.out.println("distance:" + p0.distance(p1));
    }
}
