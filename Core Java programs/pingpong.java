/*
*   Java program to implement threading using running interface...
* */

package com.company;


import java.util.Scanner;

    class ping extends Thread {
        public void run() {
            System.out.println("ping");

        try

        {
            Thread.sleep(1000);
        }
        catch(
        Exception e)

        {
            System.out.println(e);
        }
    }
    }
    class pong extends Thread{
        public void run()
        {
            try {
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
                System.out.println("pong");

            }
        }


 class day_6{
     public static void main(String[] args) {
         ping p1 = new ping();
         pong p2 = new pong();
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the no. of iteration:");
         int n = sc.nextInt();
         for(int i = 1;i<=n;i++) {
             p1.run();
             p2.run();
         }
     }
}
