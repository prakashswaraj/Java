

/*
*   Java programs to perform merge sort...
 * */

package com.dsa_java;

import java.util.Scanner;

public class mergeSort {
    public void conquer(int arr[] , int si , int mid , int ei)
    {
        int [] merged = new int [ei - si +1];
        int ind1 = si;
        int ind2 = mid+1;
        int x = 0;
        while(ind1<=mid && ind2<=ei)
        {
            if(arr[ind1]<=arr[ind2])
            merged[x++] = arr[ind1++];
            else
                merged[x++] = arr[ind2++];
        }
        while(ind1<=mid)
            merged[x++] = arr[ind1++];
        while(ind2<=ei)
            merged[x++] = arr[ind2++];
        for(int i=0 ,  j=si ; i<merged.length;i++ , j++)
            arr[j] = merged[i];
    }

    public void divide(int arr[] , int si , int ei)
    {
        if(si>=ei)
            return;
        int mid = si + (ei - si)/2;
        divide(arr , si , mid);
        divide(arr , mid + 1 ,ei);
        conquer(arr ,si , mid , ei);
    }
}
 class mergeDriver
 {
     public static void main(String[] args) {
         int n;
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the no of the elements: ");
         n = sc.nextInt();
         int [] arr = new int[n];
         System.out.println("enter the elements of the array: ");
         for(int i = 0 ; i < arr.length ;i++)
             arr[i] = sc.nextInt();
         mergeSort ms = new mergeSort();
         ms.divide(arr ,0,n-1);
         System.out.println("the sorted array is: ");
         for(int i = 0 ; i < n ;i++)
             System.out.print(arr[i] + " ");
     }
 }
