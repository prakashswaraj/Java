
/*
*   Java programs to perform linear search...
* */

package com.company;

import java.util.Scanner;

public class Linear_search_in_array {
    public static void main(String[] args) {
        int n,i,num;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array:");
        n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("enter the number to search:  ");
        num = sc.nextInt();
        System.out.println("enter the elements of the arrray:");
        for(i=0;i<n;i++)
            arr[i] = sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(arr[i]==num) {
                System.out.println("the location is: " + i);
                break;
            }
        }
        if(i==n)
            System.out.println("element is not present: ");

    }
}
