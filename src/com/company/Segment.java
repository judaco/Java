package com.company;

/**
 * Created by Hackeru on 03/08/2016.
 */
public class Segment {

    private Point p1,p2;

    public Segment(Point p1, Point p2) {
        //aliasing - Kinuy
        //this.p1 = new Point(p1.getX(), p1.getY()); - creating another copy of p1
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        //Point p = new Point(p1.getX(), p1.getY()); - A copy of p1 - without changing the p1 parameter
        //return p;
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public double slope(){//shipua - /
        double deltaX = p1.getX() - p2.getX();
        double deltaY = p1.getY() - p2.getY();
        if(deltaX == 0)
            return Double.MAX_VALUE;
        return deltaY/deltaX;
    }
    public double B(){
        return 1;
    }
    public double A(){
        return -1*slope();
    }
    public double C(){
        return slope()*p1.getX() - p1.getY();
    }
}
