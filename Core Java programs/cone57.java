

/*
*        Java programs to find slant height , volume and area of the cone using different constructor...
*/

package com.company;

import java.util.Scanner;

public class cone57 {
    int r;
    int h;
    public double slant_height()
    {
        return Math.sqrt(r*r + h*h);
    }
    public double volume()
    {
        return (Math.PI*r*r*h)/3;
    }
    public double area()
    {
        return 2*Math.PI*r*Math.sqrt(r*r + h*h);
    }
    public cone57()
    {
        r = 14;
        h = 21;
    }
    public cone57(int radius , int height)
    {
        r = radius;
        h = height;
    }
}
class cone571{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        cone57 c= new cone57();
        System.out.println("the essentials by initializing the values:");
        System.out.println("the slant height is: "+c.slant_height());
        System.out.println("the area of the cone is: "+c.area());
        System.out.println("the volume of the cone is: "+c.volume());
        System.out.println("enter the radius and height of the cone: ");
        int r = sc.nextInt();
        int h = sc.nextInt();
        cone57 cc = new cone57(r,h);


        System.out.println("the essentials by taking user input:");
        System.out.println("the slant height of the cone is: "+cc.slant_height());
        System.out.println("the area of the cone is: "+cc.area());
        System.out.println("the volume of the cone is: "+cc.volume());
    }
}
