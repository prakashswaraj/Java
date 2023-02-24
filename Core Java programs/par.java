
/*
*   Java program to implement sleep concept in java....
* */


package com.company;

import java.util.Scanner;

import static java.lang.Thread.*;

class odd extends Thread {
     public void oddno(int m,int n) {
    for(int i = m; i<=n;i++){
        if(i%2 != 0)
            System.out.println(i);
    }
         try{
             sleep(1000);}
         catch(Exception e){
             System.out.println(e);
         }
 }
}
class even extends Thread {
    public void evenno(int m,int n) {
        try {
            sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        for(int i = m; i<=n;i++){
            if(i%2 == 0)
                System.out.println(i);
        }
    }
}
 class parathread{
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        odd o = new odd();
        even e = new even();
        o.oddno(m,n);
        e.evenno(m,n);
        o.start();
        sleep(1000);
        e.start();
    }
}