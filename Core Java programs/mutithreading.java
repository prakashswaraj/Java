
/*
*   Java programs to implement the concept of multithreading...
* */

package com.company;

import java.io.OutputStream;
import java.util.Scanner;

class maxarray extends Thread {
         void arrmax ( int arr[], int n){
             int max = 0;
             for (int i = 0; i < n; i++) {
                 if (arr[i] > max) {
                     max = arr[i];
                 }
             }
                 System.out.println(max);
         }
 }
     class avgarr extends Thread{
            void avg(int arr[],int n){
                      int sum = 0,i;
                      for(i = 0;i<n;i++ ) {
                          sum = sum + arr[i];
                      }
                      System.out.println(sum);
                  }
     }
     class multithreaingss{
         public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
             System.out.println("enter the size of the array: ");
             int n= sc.nextInt();
             int [] arr = new int[n];
             System.out.println("enter the elements of the array: ");
             for(int i = 0 ; i<n ;i++){
                 arr[i] = sc.nextInt();
             }
              maxarray m = new maxarray();
             m.arrmax(arr,n);
             avgarr a = new avgarr();
             a.avg(arr,n);
             m.start();
             a.start();
         }
     }


