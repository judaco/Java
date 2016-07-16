package com.company;

public class Main {

    public static void main(String[] args) {
        drawTangle1(10, 10);
        drawX(5);
        drawCircle(30,20,10);
    }
    //Exercise 1 - Draw a Tangle
    public static void drawTangle1(int width, int height){
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print( i==0 || i==height-1 || j==0 || j==width-1 ? "*" : " ");
            }
            System.out.println();
        }
    }
    //Exercise 2 - Draw a form of X
    public static void drawX(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print( i==j || i + j == size-1 ? "*" : " ");
            }
            System.out.println();
        }
    }
    //Exercise 4
    public static void drawCircle(int a, int b, int radius) {
        for (int i = 0; i < b + radius + 10; i++) {
            for (int j = 0; j < a + radius + 10; j++) {
                System.out.print(isPointOnCircle(a, b, radius, j, i) ? "*" : " ");
            }
            System.out.println();
        }
    }

    public static boolean isPointOnCircle(int a, int b, int radius, int x, int y){
        int deltaX = a - x;
        int deltaY = b - y;
        int difference = (deltaX*deltaX + deltaY*deltaY) - radius * radius;
        if(difference < 0)
            difference *= -1;
        return difference < 5;
    }
}
