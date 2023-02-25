
/*
* Java programs to find the kth element of the given array...
 */

package com.dsa_java;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class kthelementinrray {
    public int kthLargest(int arr[] , int k)
    {
        PriorityQueue<Integer> pq  = new PriorityQueue<>();
        for(int i=0;i<k;i++)
        {
            pq.add(arr[i]);
        }
        for(int i = k;i<arr.length;i++)
        {
            if(pq.peek() < arr[i])
            {
                pq.poll();
                pq.add(arr[i]);
            }
        }
        return pq.peek();
    }
    public int kthSmallest(int arr[] , int k)
    {
        PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<k;i++)
        {
            p.add(arr[i]);
        }
        for(int i=k;i<arr.length;i++)
        {
            if(p.peek()>arr[i])
            {
                p.poll();
                p.add(arr[i]);
            }
        }
        return p.peek();
    }
}
class kth
{
    public static void main(String[] args) {
        int n,x,k,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements of the array: ");
        n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("enter the elements of the array: ");
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the which kth no.");
        k = sc.nextInt();
        kthelementinrray kt = new kthelementinrray();
        x =  kt.kthLargest(arr,k);
        System.out.println("The kth largest element is:" + x);

        y = kt.kthSmallest(arr,k);
        System.out.println("The kth smallest element is: " +y);

    }
}
