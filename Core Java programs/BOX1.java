

/*
*    Java programs to implement constructor in different ways...
* */

package com.company;

 class BOX1 {
     private int l, b, h;


     BOX1() {
         l = 10;
         b = 2;
         h = 6;
     }
     BOX1(int x, int y, int z)
     {
         l=x;
         b=y;
         h=z;
     }

     public int getL() {
         return l;
     }

     public void setL(int l) {
         this.l = l;
     }

     public int getB() {
         return b;
     }

     public void setB(int b) {
         this.b = b;
     }

     public int getH() {
         return h;
     }

     public void setH(int h) {
         this.h = h;
     }
 }
  class constrictor1{
     public static void main(String[] args) {
       BOX1 b2 = new BOX1();
       BOX1 b3 = new BOX1(2,4,6);
         System.out.println(b2.getL());
         System.out.println(b2.getB());
         System.out.println(b2.getH());
         System.out.println(b3.getL());
         System.out.println(b3.getB());
         System.out.println(b3.getH());
     }
 }

