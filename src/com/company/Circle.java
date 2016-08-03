package graphicshape;

/**
 * Created by hackeru on 27/07/2016.
 */
public class Circle extends Shape {
    private int radius;

    public Circle(int r) {
        setRadius(r);
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
}
