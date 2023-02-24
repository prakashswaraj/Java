
/*
*   Java program to implement the concept of swapping ...
* */

package com.company;

import java.util.Scanner;

public class swap {
   // public int a,b;
    public void swap1(int x,int y)
    {
        int t = x;
        x= y;
        y = t;

    }
}
class swapping{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        swap obj = new swap();
        obj.swap1(a,b);
        
    }
}
