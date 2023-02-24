
/*
*   java program to find the sum of marks using array...
* */

package com.company;

import java.util.Scanner;

public class Array_in_java_2 {
    public static void main(String[] args) {
        int n,i,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers:");
        n = sc.nextInt();
        int [] marks = new int [n];
        System.out.println("enter the marks: ");
        for( i=0;i<n;i++)
        {
           marks[i] = sc.nextInt();
        }
        System.out.println("the sum of your marks are: ");
        for(i=0;i<n;i++)
        {
            //System.out.println(marks[i]);
            sum = sum + marks[i];
        }
        System.out.println(sum);
    }
}
