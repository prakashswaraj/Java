
/*
    Addition of complex number.
*/

package com.java_gfgs;

import java.util.Scanner;

public class complexNumberSum {
    int real,image;
    public complexNumberSum(int r,int im){
        real = r;
        image = im;
    }
    public void printComplex(){
        System.out.println(real+"+i"+image);
    }
    public static complexNumberSum add(complexNumberSum c1,complexNumberSum c2){
        complexNumberSum res = new complexNumberSum(0,0);
        res.real = c1.real+ c2.real;
        res.image  = c1.image + c2.image;
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the data for first complex no.");
        int a= sc.nextInt();
        int b = sc.nextInt();
        complexNumberSum c1 = new complexNumberSum(a,b);
        System.out.println("enter the data for second complex no.");
        int x= sc.nextInt();
        int y = sc.nextInt();
        complexNumberSum c2 = new complexNumberSum(x,y);
        System.out.println("the first complex number is: ");
        c1.printComplex();
        System.out.println("the second complex number is: ");
        c2.printComplex();
        System.out.println("the result is: ");
        complexNumberSum res = add(c1,c2);
        res.printComplex();
    }
}
