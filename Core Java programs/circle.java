
/*
*   Java program to implement inheritance...
* */

package com.company;

import java.util.Scanner;

public class circle {
    public int r,h;
    public  double  area (int r)
    {
        return 3.14*r*r;
    }
}
class Cylinder extends circle{
     public double volume()
    {
        return 6.18*r*h;
    }
}
class inherit57{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("enter the radius as well as height:");
        int r = sc.nextInt();
        int h = sc.nextInt();
        //circle c = new circle();
        //System.out.println(c.area(r));
        Cylinder cc = new Cylinder();
        System.out.println(cc.volume());


    }
}
