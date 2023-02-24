

/*
* implementation of different constructor using java...
* */

package com.company;

import java.util.Scanner;

public class boxess {
    int length;
    int breadth;
    int height;
    public double volume ()
    {
        return length*breadth*height;
    }
    public boxess()
    {
        length = 12;
        breadth =10;
        height = 15;
    }
    public boxess(int l , int b , int h)
    {
        length = l;
        breadth = b;
         height = h;
    }

}
class calc57{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the dimensions:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        boxess b= new boxess();
        System.out.println(b.volume());
        boxess b1 = new boxess(x,y,z);
        System.out.println(b1.volume());
    }
}
