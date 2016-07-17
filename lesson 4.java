package com.company;

public class Main {

    public static void main(String[] args) {
        drawTangle(5,5);
        drawX(5);
        System.out.println(sqrtPrecise(16));
        drawTangle2(5,5,5,5);
    }
    //Exercise 1
    public static void drawTangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(i == 0 || i == height - 1 || j == 0 || j == width - 1 ? "*" : " ");
            }
            System.out.println();
        }
    }
    //Exerciese 2
    public static void drawX(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print( i==j || i + j == size-1 ? "*" : " ");
            }
            System.out.println();
        }
    }
    //Exercise 3 - Put x and y and Center the Tangle
    public static void drawTangle2(int x, int y, int width, int height){
        for (int i = 0; i < y ; i++) {
            System.out.println();
        }
        for (int i = 0; i < height ; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < width; j++) {
                System.out.print(i == 0 || i == height - 1 || j == 0 || j == width - 1 ? "*" : " ");
            }
            System.out.println();
        }

        }
    //Exercise Other - Square Root none Integer (using of double)
    public static double abs(double x){
        return x < 0 ? -x : x;
    }

    public static double sqrtPrecise(double x){
        double result = 0;
        double add = 1000;
        int count = 0;
        while (abs(x - result * result) > 0.00001){
            while((result + add) * (result + add) >= x){
                add /= 10;
                count++;
            }result += add;
            System.out.println(count);
        }return result;
    }
}
