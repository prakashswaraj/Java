
/*
*   Java program tp implement thread concept in java...
* */

package com.company;

import java.util.Scanner;

public class day6_4 {
    class ThreadDemo extends Thread {
        String s;
        int r;

       ThreadDemo(String s, int r) {
            this.s = s;
            this.r = r;
        }

        public void run() {
            int x;
            if (s.equals("odd"))
                x = 1;
            else
                x = 2;
            for (; x <= r; x += 2) {
                System.out.println(x);
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
        }
    }

    class Driver {
        public  void main(String arg[]) throws InterruptedException {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter limit");
            int r = sc.nextInt();
            ThreadDemo obj1 = new ThreadDemo("odd", r);
            ThreadDemo obj2 = new ThreadDemo("even", r);
            obj1.start();
            Thread.sleep(500);
            obj2.start();
        }
    }
}
