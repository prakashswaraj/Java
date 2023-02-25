
/*
*   Java programs to implement quick sort...
* */

package com.dsa_java;

import java.util.Scanner;
//TIME COMPLEXITY: O(n^2)
//average case: O(NLogN)
//space complexity: O(1)
public class quickSort {
    public void  quick(int arr[] ,int low ,int high )
    {
        if(low<high) {
            int pivotIndex = partition(arr, low, high);
            quick(arr, low, pivotIndex - 1);
            quick(arr, pivotIndex + 1, high);
        }
    }
    public int partition(int arr[] ,int low , int high)
    {
        int i = -1;
        int j = low , temp;
        int pivot = arr[high];
        for(j = 0; j< high ; j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }
}

class quickDriver
{
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of the elements: ");
        n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        quickSort qs = new quickSort();
        qs.quick(arr , 0 , n-1);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i] + " ");
    }
}
