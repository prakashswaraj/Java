
/*
*   Java program to perform bubble sort...
* */

package com.dsa_java;

import java.util.Scanner;
//TIME COMPLEXITY O(n^2)
public class bubbleSort {
    public void bubble(int arr [])
    {
        int temp;
        for(int i =0 ;i<arr.length;i++)
        {
            boolean flag = false;
            for(int j = 0 ; j<arr.length-i-1;j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(flag == false)
                break;
        }
        System.out.println("The sorted array is: ");
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+ " " );
    }
}
class bubbleDriver
{
    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements of the array: ");
        n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0 ; i < n ; i++)
            arr[i] = sc.nextInt();
        bubbleSort bs = new bubbleSort();
        bs.bubble(arr);
    }
}
