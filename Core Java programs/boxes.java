
/*
*    Java programs to implement the constructor using getter and setter.....
* */

package com.company;

import java.util.Scanner;

public class boxes {
    private  int length;
    private int width;
    private int height;
    public double volume()
    {
        return  length*width*height;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
    public  boxes()
    {
         length = 10;
         width = 15;
         height = 20;
    }
    public  boxes(int l,int w,int h)
    {
         length = l;
         width = w;
         height= h;
    }

}
class volume57{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length,width and height: ");
        int x = sc.nextInt();
       int y= sc.nextInt();
        int z = sc.nextInt();
        boxes b = new boxes();
        System.out.println(b.getHeight());
        System.out.println(b.getLength());
        System.out.println(b.getWidth());
        System.out.println(b.volume());
        boxes b1 = new boxes(x,y,z);
        double c = b1.volume();
        System.out.println(c);

    }
}
