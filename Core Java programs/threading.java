
/*
*   Java program to implement the concept of threading..
*/

package com.company;

 class Mythread extends Thread{
     public void run(){
         System.out.println("Good morning!");
     }
}
class mythread2 extends Thread{
    public void run(){
        try {
            Thread.sleep(2000 );
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Welcome ");
    }
}
class threadings {
    public static void main(String[] args) {
        Mythread t1 = new Mythread();
        mythread2 t2 = new mythread2();
        t1.setPriority(2);
        t2.setPriority(4);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t1.getState());
        System.out.println(Thread.currentThread().getState());
        System.out.println(t2.getStackTrace());
        while (true) {
            t1.run();
            t2.run();

        }
    }
}