
/*
*  Java program to find good pairs in array...
* */

package com.company;

import java.util.Scanner;

public class goodPairs {
    public static void main(String[] args) {
        int i,j,n,count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("enter the elements of the array: ");
        for(i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(i= 0 ; i<n ;i++) {
            if (i != n - 1) {
                for (j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
