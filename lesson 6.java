package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(largestNumArray(new int[]{10, 70, 50, 60}));
        System.out.println(avgArray(new int[] {15, 25, 35, 55, 62, 80}));
    }

    //Exercise 1 - Get an Array (of numbers) and return the largest number on the Array
    public static int largestNumArray(int [] x) {
        int largest = x[0];
        for (int i = 0; i < x.length ; i++) {
            if (x[i] > largest){
                largest = x[i];
            }
        }
        return largest;
    }
    //Exercise 2
    public static double avgArray(int [] x){
        int sum = 0;
        double avg = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
            avg = sum/x.length;
        }return avg;
    }
}