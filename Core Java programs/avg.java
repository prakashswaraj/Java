

/*
*    Java programs to calculate the average of numbers using array...
 * */

package com.company;

import java.util.Scanner;

public class avg {
    int i = 0;
   // Scanner sc = new Scanner(System.in);
   // int [] arr;

    public float avgs(int n,int [] arr ) {
        int sum = 0;
        for (i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        float av = sum / n;
        return av;
    }
}
class avg_56{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int n = sc.nextInt();
        int [] ar = new int [n];
        System.out.println("enter the elements of the array: ");
        for(int i = 0 ; i< n ;i++)
        {
            ar[i] = sc.nextInt();
        }
        for(int i = 0 ;i< n;i++)
        {
            System.out.println(ar[i]);
        }
        avg ob = new avg();
        float c =ob.avgs(n,ar);
        System.out.println("the avg is: " +c);
    }
}
