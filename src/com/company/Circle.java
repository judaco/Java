package graphicshape;

/**
 * Created by hackeru on 27/07/2016.
 */
public class Circle extends Shape {
    private int radius;
    private int xPos, yPos;

    public Circle(int xPos, int yPos, int radius){
        this.xPos = xPos;
        this.yPos = yPos;
        setRadius(radius);
    }

    public Circle(int r) {//call up - this (10,10,r) --> public Circle(int xPos, int yPos, int radius)
        this(10,10,r);
    }

    public Circle(){//call up - this (7) --> public Circle (int r)
        this(7)
    }
    @Override
    public String toString(){
        return "center = (" + xPos + "," + yPos + ") and radius = " + radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius >= 0)
        this.radius = radius;
    }

    public double area(){
       return Math.PI* radius * radius;
    }

    void fillcolor(){
        System.out.println("color: " + color);
    }
    public void fillColor(int red, int green, int blue){

    }
    public void fillColor(float hue, float saturation, float brightness){

    }
}
