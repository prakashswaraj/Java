
/*
*     Java program to find distinct element of the array...
* */

package com.company;

import java.util.Scanner;

public class distinctarr {
    public static void main(String[] args) {
       int count = 0,i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array:: ");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("enter the elements of the array: ");
        for( i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
            for(i=0;i<n;i++) {
                count = 0;

                    for (j = 0 ; j < n; j++) {
                        if(arr[i]==arr[j]){
                            count++;
                        }
                    }
                    if(count>=1){
                        System.out.println(arr[i]);
                    }
                }
            }
    }

