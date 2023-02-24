
/*
*  calculation of factorial using java...
*
* */

package com.company;

import java.util.Scanner;

public class Fact_4_java {

    static int factorial(int a) {
        if(a==0||a==1)
            return 1;
        else
         return ( a * factorial(a - 1));
    }

    public static void main(String[] args) {
        int n, fact;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number: ");
        n = sc.nextInt();
        fact = factorial(n);
        System.out.println(fact);

    }

}