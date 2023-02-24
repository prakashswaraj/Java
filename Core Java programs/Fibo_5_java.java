
/*
*    Java programs to calculate fibonacci series...
* */

package com.company;

import java.util.Scanner;

public class Fibo_5_java {
    static int fibonacci(int x)
    {
        if(x==0||x==1)
            return 1;
        else
            return fibonacci(x-1)+fibonacci(x-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = sc.nextInt();
        int result = fibonacci(n);
        System.out.println(result);
    }
}
