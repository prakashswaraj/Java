
/*
*   Java program to implement the concept of  inheritance...
* */

package com.company;

import java.util.Scanner;

abstract class ThreeDObject {
    protected double  l,b,h,r;
    abstract public void wholeSurface();
    abstract public void Volume();
}
class BOX12 extends ThreeDObject{
    Scanner sc = new Scanner(System.in);
    BOX12(){
        System.out.println("enter the length,breadth,height of the box: ");
         l = sc.nextInt();
         b = sc.nextInt();
         h = sc.nextInt();

    }
      public void  wholeSurface()
     {
         double ws = 2*(l*b+b*h+h*l);
         System.out.println("the whole surface area is: "+ws);
     }
     public void Volume()
     {
         double v = l*b*h;
         System.out.println("the volume of the box: "+v);
     }
}
class cube extends ThreeDObject{
    Scanner sc = new Scanner(System.in);
    cube()
    {
        System.out.println("enter the side of the cube:");
         l = sc.nextInt();
    }
    public void wholeSurface()
    {
        double ws = 6*l*l;
        System.out.println("the whole surface area of cube is: "+ws);
    }
    public void Volume()
    {
        double v = l*l*l;
        System.out.println("the volume of the cube is: "+v);
    }
}
class Cylinder12 extends ThreeDObject{
    Scanner sc = new Scanner(System.in);
    Cylinder12()
    {
        System.out.println("enter the radius , length, height of the cylinder: ");
         r  = sc.nextDouble();
         l = sc.nextDouble();
         h = sc.nextDouble();
    }
    public void wholeSurface()
    {
        double ws = (2*Math.PI*r*h + 2*Math.PI*r*r*h);
        System.out.println("the surface area of the cylinder is: "+ws);
    }
    public void Volume()
    {
        double v = Math.PI*r*r*h;
        System.out.println("the volume of the cylinder is: "+v);
    }
}
class cone12 extends ThreeDObject{
    Scanner sc = new Scanner(System.in);
    cone12()
    {
        System.out.println("enter the radius ,height and length of the cone: ");
         r = sc.nextDouble();
         h = sc.nextDouble();
         l = sc.nextDouble();
    }
    public void wholeSurface(){
         l = Math.sqrt(h*h + r*r);
        double ws = (2*Math.PI*r*l + Math.PI*r*r);
        System.out.println("the surface area of the cone is: "+ws);
    }
    public void Volume() {
        double v = (Math.PI * r * r * h)/3.0;
        System.out.println("the volume of the cone is" +v);
    }
}
 class objects{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       while(true){
           System.out.println("\n1.BOX\n2.CUBE\n3.CYLINDER\n4.CONE");
           System.out.println("enter the choice: ");
           int ch = sc.nextInt();
           switch(ch){
               case 1:
               BOX12  b = new BOX12();
               b.wholeSurface();
               b.Volume();
               break;
               case 2:
                   cube c = new cube();
                   c.wholeSurface();
                   c.Volume();
                   break;
               case 3:
                   Cylinder12 c1 = new Cylinder12();
                   c1.wholeSurface();
                   c1.Volume();
                   break;
               case 4:
                   cone12 c2 = new cone12();
                   c2.wholeSurface();
                   c2.Volume();
                   break;
               default:
                   System.out.println("invalid option:");
           }
       }
    }
}
