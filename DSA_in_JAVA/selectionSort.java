/*
*     Java programs to implement selection sort...
 * */

package com.dsa_java;

import java.util.Scanner;

public class selectionSort {
    public void selection(int arr[])
    {
        for(int i = 0 ;i< arr.length - 1 ;i++)
        {
            int min = i;
            for(int j = 1+i ; j<arr.length;j++)
            {
                if (arr[j] < arr[min])
                    min = j;
            }
            if(min!=i)
            {
                int temp = arr[i];
                arr[i]  = arr[min];
                arr[min] = temp;
            }
        }
        System.out.println("The sorted array is: ");
        for(int i = 0 ; i < arr.length ; i++)
            System.out.print(arr[i]+ " ");
    }
}
class selectionDriver
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of the elements of the array: ");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0 ; i<arr.length ;i++)
            arr[i] = sc.nextInt();
        selectionSort ss = new selectionSort();
        ss.selection(arr);
    }
}
