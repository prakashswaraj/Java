/*
*    Java programs to perform math operation.....
* */

package com.company;

import java.util.Scanner;

import static java.lang.Math.PI;

public class mathoperation {
     static float PI;

     static double  mul(double x,double y) {
         double  res1;
         res1 = x * y;
         return res1;
     }

     static double  div(double x,double y) {
         double  res2;
         res2 = x / y;
         return res2;
     }
 }
 class math{
     public static void main(String[] args) {
         mathoperation m = new mathoperation();
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the radius of the circle: ");
         double r = sc.nextDouble();
         double A1 =Math.PI* m.mul(r,r);
         System.out.println("the area of the circle is:" +A1);
         double A2 = m.div(A1,2);
         System.out.println("the area of the half circle is: "+A2);
     }
 }
