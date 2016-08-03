package com.company;

import graphicshape.Circle;
import graphicshape.Shape;

public class Main {

    public static void main(String[] args) {
        Shape s = new Shape;
        s.color = 14567;
        System.out.println(s.color);

        Circle circle = new Circle();
        System.out.println(circle.area());
    }
}
