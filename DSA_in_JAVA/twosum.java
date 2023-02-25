
/*
*     Java programs to find two sum in the given array...
 * */

package com.dsa_java;

import java.util.Scanner;



class twoSumSol
{
    public void mySum(int [] arr , int target)
    {
        int i,j=0;
        for(i=0;i<arr.length ; i++)
        {
            j = i+1;
            while(j<arr.length)
            {

                if(arr[i] + arr[j] == target)
                {
                    System.out.println("the indices are: " +i  +j);
                    break;
                }
                else
                {
                    j++;
                }
            }
        }
        if(i == arr.length)
            System.out.println("such pair does not exist: ");

    }
}
public class twosum {
    public static void main(String[] args) {
        int n , i , target;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements of the array: ");
        n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("the elements of the array are: ");
        for(i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the target element: ");
        target = sc.nextInt();
        twoSumSol ms = new twoSumSol();
        ms.mySum(arr,target);
    }
}
