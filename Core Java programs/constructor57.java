
/*
*    Java programs to implement constructor...
* */

package com.company;

import java.util.Scanner;

public class constructor57 {
    private int r,h;
       public constructor57(int r, int h)
    {
        this.h = h;
        this.r = r;


    }
    public int getR(){
           return r;
    }
    public int getH(){
           return h;
    }
}
class cylinder1{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int ra = sc.nextInt();
    int he = sc.nextInt();
        constructor57 ob = new constructor57(ra,he);
        int x = ob.getH();
        int y = ob.getR();
        double Area = 2*3.14*y*x;
        double volume = 3.14*y*y*x;
        System.out.println(Area);
         System.out.println(volume);
 }
}


