
/*
*  Java program to print star pattern..
* */

package com.company;
import java.util.Scanner;
public class java7_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows:");
        int n = sc.nextInt();
        int i;
        int j;
        for(i=1;i<=n;i++)
        {
            for( j=1;j<=n;j++)
            {
                if(j<=i)
                System.out.print("*");
                else
                    System.out.println();
            }
           System.out.print("\n");
        }
    }
}
