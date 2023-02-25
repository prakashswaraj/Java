
/*
*  Java programs to perform insertion sort...
 * */


package com.dsa_java;


import java.util.Scanner;

public class insertionSort {
    public void insert(int arr[])
    {
        for(int i = 0 ; i < arr.length ;i++)
        {
            int temp = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>temp)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        System.out.println("The sorted array is: ");
        for(int i = 0 ; i< arr.length;i++)
            System.out.print(arr[i] + " ");
    }
}
class insertionDriver
{
    public static void main(String[] args)
    {
        int n;
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the no. of the elements: ");
        n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0;i<n;i++)
            arr[i] = sc.nextInt();
        insertionSort is  = new insertionSort();
        is.insert(arr);
    }
}
