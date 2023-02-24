
/*
*  Java programs to find the slant height , volume and area of cone  by using getter and setter
* and constructor...
*
* */

package com.company;

import java.util.Scanner;

public class cone {
    private double r,h;
     cone(double radius,double height){
         r = radius;
         h = height;
    }

    public double getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public double getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }
    public double slant_h(double x,double y){
         double l = (Math.sqrt((x)+(y)));
         return l;
    }
    public double volume(double x,double y)
    {
        double vol = (3.142*x*x*y)/3;
        return  vol;
    }
    public double area(double x,double y){
         double a = 3.142*x*x+3.142*x* Math.sqrt(y);
         return a;
    }
}
    class about_cone{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius");
        double x1 = sc.nextDouble();
        System.out.println("enter the height ");
        double y1 = sc.nextDouble();
        cone c = new cone(x1,y1);
        System.out.println(c.getR());
        System.out.println(c.getH());
        double s = c.slant_h(x1,y1);
        double v = c.volume(x1,y1);
        double a = c.area(x1,y1);
        System.out.println("the slant height is: "+s);
        System.out.println("the volume is : "+v);
        System.out.println("the area is: "+a);
    }
}

