
/*
*   Program to implement binary search using Iteration ...
* */
package com.dsa_java;

import java.util.Scanner;

public class BinarySearchUsingIteration {
        public int binaryS(int arr[] , int key)
    {
        int low = 0 , high = arr.length - 1;
        while(low<=high)
        {
            int mid = (low + high)/2;
            if(key == arr[mid])
                return mid;
            else if(key>arr[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
        if(low>high)
            System.out.println("the element is not present.");
        return -1;
    }

}
class bbSearch
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
        BinarySearchUsingIteration bs = new BinarySearchUsingIteration();
         int x = bs.binaryS(arr , key);
         System.out.println("The position of the element is: "+x);

    }
}

