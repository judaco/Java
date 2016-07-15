package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumOfDigits(123));
        System.out.println(largest(12));
        System.out.println(reverseDigits(125));
        System.out.println(squareRoot(256));
    }
    //Exercise 1 - Get a number and return the summary of all digits
    public static int sumOfDigits(int x){
        int result = 0;
        int lastdigit;
        while (x != 0) {
            lastdigit = x % 10;
            x /= 10;
            result += lastdigit;
        }
        return result;
    }

    //Exercise 2 - Get a number and return the largest digit within the number
    public static int largest(int x){
        int result = 0;
        int lastdigit;
        while (x != 0) {
            lastdigit = x % 10;
            x /= 10;
            if (lastdigit > result)
                result = lastdigit;
        }
        return result;
    }

    //Exercise 3 - Get a number and return the reverse digits of it
    public static int reverseDigits(int x){
        int result = 0;
        int lastdigit;
        while (x != 0) {
            lastdigit = x % 10;
            x /= 10;
            result = result * 10 + lastdigit;
        }
        return result;
    }
    //Exrcise 4 - Get a number and return his square root
    public static int squareRoot(int x){
        int result = 0;
        while (result * result < x)
            result++;
        return result;
    }
}