package ru.stqa.pft.sandbox;

import static java.lang.Math.sqrt;

public class Point {
    public double x;
    public double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double distance(Point p1, Point p2) {
        return sqrt(((this.x-p2.x)*(this.x-p2.x))+((this.y-p2.y)*(this.y-p2.y)));
    }
}

