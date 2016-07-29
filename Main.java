package com.company;

public class Main {

    public static void main(String[] args) {
        int[] nums = {15, -20, -30, 40, 50};
        System.out.println(maxArray(nums));
        System.out.println(avg(nums));
        int[] arr1 = {1, 3, 5, 7, 9, 11};
        int[] arr2 = {7, 9, 11};
        System.out.println(subArray(arr1, arr2));
        int[] arr = {15, 35, 65, 95, 75};
        printArr(arr);
        sort(arr);
        sort2(arr);
        sort3(arr);
        int[] anArray = {2,-2,-3,7,4,-1};
        System.out.println(seqMaxSum(anArray));
    }

    //Exercise 1 - Get an Array (of numbers) and return the largest number on the Array
    public static int maxArray(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        return max;
    }

    //Exercise 2 - Gat an Array (of numbers) and return the average of them
    public static double avg(int[] nums) {
        double sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            sum += num;
        }
        return sum / nums.length;
    }

    //Exercise 3 - find a match of sub array in 2 Arrays A and B
    public static boolean subArray(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null) {
            return false;
        }
        if (arr2.length == 0)
            return true;
        for (int i = 0; i <= arr1.length - arr2.length; i++) {
            if (arr2[0] == arr1[i]) {
                boolean match = true;
                for (int j = 1; j < arr2.length; j++) {
                    if (arr1[i + j] != arr2[j]) {
                        match = false;
                        break;
                    }
                }
                if (match)
                    return true;
            }
        }
        return false;
    }

    //Exercise 4
    public static void printArr(int[] arr) {
        System.out.print("{");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ",");
        }
        if (arr.length > 0)
            System.out.print(arr[arr.length - 1]);
        System.out.println("}");
    }

    //Exercise 4 continue - Sort an array - by Bubble Sort
    public static void sort(int[] arr) {
        boolean isSorted = false;
        int upTo = arr.length - 1;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < upTo; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    isSorted = false;
                }
            }
            upTo--;
        }
        System.out.print("{");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ",");
        }
        if (arr.length > 0)
            System.out.print(arr[arr.length - 1]);
        System.out.println("}");
    }

    //Exercise 5 - Sort an Array from the largest num to the smallest
    public static void sort2(int[] arr) {
        boolean isSorted = false;
        int upTo = arr.length - 1;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < upTo; i++) {
                if (arr[i] < arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    isSorted = false;
                }
            }
            upTo--;
        }
        System.out.print("{");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ",");
        }
        if (arr.length > 0)
            System.out.print(arr[arr.length - 1]);
        System.out.println("}");
    }

    //Exercise 5 - Sort an Array from the last number to the first number (reverse order)
    public static void sort3(int[] arr) {

    }
    //Exercise 6 - find the biggest sum of sequence in Array
    public static int seqMaxSum(int[ ] anArray) {
        int sum = 0;
        int max = 0;
        for (int i=0; i < anArray.length; i++) {
            sum += anArray[i];
            if (max < sum)
                max = sum;
            else if (sum < 0)
                sum = 0;
        }
        return max;
    }
}