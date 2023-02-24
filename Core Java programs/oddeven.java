
/*
*   Java program to find odd and even no. in an array...
* */

package com.company;

import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int n = sc.nextInt();
        int [] arr = new int [n];
        int [] ar = new int [n];
        System.out.println("enter the elements of the array:");
        for(int i = 0 ; i<n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ;i<n;i++) {
            if (arr[i] % 2 == 0) {
                System.out.println("even no: " +arr[i]);
            }
            else
            {
                System.out.println("odd no: " +arr[i]);
            }
        }
    }
}
