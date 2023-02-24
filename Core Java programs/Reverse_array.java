
/*
*   Java program to reverse the array....
* */

package com.company;

import java.util.Scanner;

public class Reverse_array {
    public static void main(String[] args) {
        int i,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements: ");
        n = sc.nextInt();
        int [] arr1 = new int[n];
        System.out.println("enter the elements of the array: ");
        for(i=0;i<n;i++)
            arr1[i] = sc.nextInt();
        for(i=0;i<n;i++)
            arr1[i] = arr1[n-1-i];
        System.out.println("the reversed array is :");
        for(i=0;i<n;i++)
            System.out.println(arr1[i]);
    }
}
