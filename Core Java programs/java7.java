
/*
*    Java programs to calculate a table using array...
* */

package com.company;

import java.util.Scanner;

 public class java7 {
    Scanner sc = new Scanner(System.in);
   // System.out.format("enter the size of the array");
    int m=sc.nextInt();
    int [] mtable = new int[m];
    public void table(int n)
    {
        for(int i=1;i<=m;i++)
        {
             mtable[i] = n*i;
        }
        for (int i=1;i<=10;i++)
        {
            System.out.println(mtable[i]);
        }
    }
}
class multab
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number to find the table:");
        int n = s.nextInt();
        java7 b =new java7();
        b.table(n);
    }
}
