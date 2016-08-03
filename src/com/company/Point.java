package com.company;

/**
 * Created by Hackeru on 03/08/2016.
 */
public class Point {
    private int x,y

    public Point(int x, int y) {//constructor
        setX(x);
        setY(y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if(x < 0)
            return;
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if(y < 0)
            return;
        this.y = y;
    }

    public double distanceTo(Point other){//distance between other and the point on her the methoud setted on
        int deltaX = this.x - other.x;
        int deltaY = this.y - other.y;
        return Math.sqrt(deltaX*deltaX + deltaY*deltaY);//square root
    }
}
