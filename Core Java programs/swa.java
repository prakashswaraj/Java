
/*
*  There is a problem in this code ...
* */

package com.company;

import java.util.Scanner;

class threaddemo extends Thread{
     String s;
    int r;
    threaddemo(String s,int r){
        this.s = s;
        this.r = r;
    }
    public void run(){
        int x;
        if(s.equals("odd"))
            x = 1;
        else
            x = 2;
        for(;x<=r;x=+2){
            System.out.println(x);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e)
            {}
        }
    }
}
class thread123{
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the limit: ");
        int n = sc.nextInt();
        threaddemo t = new threaddemo("odd",n);
        threaddemo tt = new threaddemo("even",n);
        t.run();
        Thread.sleep(1000);
        tt.run();
    }
}
