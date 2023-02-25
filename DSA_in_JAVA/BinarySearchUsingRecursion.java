
/*
*   Java program to perform binary search using  RECURSIVE approach...
* */

package com.dsa_java;

import java.util.Scanner;

//Iterative Approach
public  class BinarySearchUsingRecursion {
//    public int binaryS(int arr[] , int key)
//    {
//        int low = 0 , high = arr.length - 1;
//        while(low<=high)
//        {
//            int mid = (low + high)/2;
//            if(key == arr[mid])
//                return mid;
//            else if(key>arr[mid])
//                low = mid + 1;
//            else
//                high = mid - 1;
//        }
//        if(low>high)
//            System.out.println("the element is not present.");
//        return -1;
//    }


    // Recursive method
    int binarySE(int arr [] ,int key , int low , int high)
    {
        int mid = (low + high)/2;
        if(low>high)
        {
            System.out.println("the element is not present: ");
            return -1;
        }
        if(key == arr[mid])
            return mid;
        if(key>arr[mid])
           return binarySE(arr , key , mid + 1 , high);
        if (key<arr[mid])
           return binarySE(arr , key , low , mid - 1 );

        return -1;
    }
}
 class bSearch
{
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of the elements: ");
        n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("enter the elements of the array in sorted form: ");
        for(int i = 0;i<arr.length;i++)
            arr[i] = sc.nextInt();
        System.out.println("enter the key to search: ");
        int key = sc.nextInt();
        BinarySearchUsingRecursion bs = new BinarySearchUsingRecursion();
       // int x = bs.binaryS(arr , key);
       // System.out.println(x);
        int y  = bs.binarySE(arr , key ,0 , arr.length-1);
        System.out.println(y);
    }
}
