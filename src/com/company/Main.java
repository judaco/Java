package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(distance(3,5));
        System.out.println(product(2,3));
        System.out.println(product2(8,2));
        System.out.println(integrity(7,3));
        System.out.println(power(1,0));
        System.out.println(power2(3,4));
    }
    //Exercise 1
    public static int distance(int x, int y){
        int small = x;
        int large = y;
        if (x > y){
            small = y;
            large = x;
        }
        int result = 0;
        while(result + small < large)
            result++;
        return result;
    }
    //Exercise 2
    public static int product(int x, int y){
        int small = x;
        int large = y;
        if (x > y){
            small = y;
            large = x;
        }
        int result = 0;
        for (int i = 0; i < small ; i++)
            result += large;
        return result;
    }
    //Exercise 2 - other option
    public static int product2(int x, int y){
        int result = 0;
        for (int i = 0; i < x ; i++)
            result += y;
        return result;
    }
    //Excercise 3
    public static int integrity(int x, int y){
        int d = y;
        int i = 0;
        while( d <= x ){
            d += y;
            i++;}
        return i;
    }
    //Exercise 3 other option
    public static int quotient(int x, int y) {
        if (y == 0)
            return -1;
        int count = 0;
        int sum = y;
        while (sum <= x) {
            count++;
            sum += y;
        }
        return count;
    }
    //Exercise 4
    public static int remainder(int x, int y){
        if( y==0 )
            return -1;
        return distance(x, product(quotient(x,y),y));
    }
    //Exercise 5 - the power of X in Y
    public static int power(int x, int y){
        if ( x==0 ){
            if( y==0 )
                return -1;
            return 0;
        }
        if ( y==0 || x==1 )
            return 1;
        int result = x;
        for (int i = 1; i < y ; i++)
            result *= x;
        return result;
    }
    //Excercise 6 - the power of X in Y - without using 'While or For'
    public static int power2(int x, int y){
        if ( x==0 ){
            if( y==0 )
                return -1;
            return 0;
        }
        if ( y==0 || x==1 )
            return 1;
        return power2(x, y-1) *x;
    }
}