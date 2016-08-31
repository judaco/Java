package com.company;

public class Main {
    public static void main(String[] args){
        System.out.println("start");


        //כתוב פונקציה שמקבלת מערך של מחרוזות ומחרוזת נוספת
        //הפונקציה תדפיס את המקומות במערך שבו נמצא המחרוזת שהתקבלה


        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hi");
                int result = longRunningTask();
                System.out.println("end " + result);
            }
        });
        t.start();

        System.out.println("done");
    }

    public static int longRunningTask(){
        int x = 0;
        for (int i = 0; i < 2000000000; i++) {
            for (int j = 0; j < 5; j++) {
                if(i%2==0)
                    x++;
            }
        }
        return x;
    }

}