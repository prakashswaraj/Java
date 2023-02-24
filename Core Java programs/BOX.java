
/*
*    Java programs to implement constructor...
* */

package com.company;

import java.util.Scanner;

class BOX {
     private int length, breadth, height;
     BOX (int l,int b,int h)
     {
         length = l;
         breadth = b;
         height = h;
     }
     public int volume(int x,int y,int z)
     {
         int vol = x*y*z;
         return vol;
     }
 }
 class constructor{
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int l = sc.nextInt();
         int b = sc.nextInt();
         int h = sc.nextInt();
         BOX b1 = new BOX(l,b,h);
        int c= b1.volume(l,b,h);
         System.out.println(c);
     }
 }
