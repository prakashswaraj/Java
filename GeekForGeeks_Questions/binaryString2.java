
/*
    Addition operation on two  binary numbers using array.
*/

package com.java_gfgs;

import java.util.Scanner;

public class binaryString2 {
    public static void main(String[] args) {
        int b1,b2,c=0,i=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first binary: ");
        b1 = sc.nextInt();
        System.out.println("enter the second binary: ");
        b2 = sc.nextInt();
        int [] arr = new int [10];

        while(b1!=0 || b2!=0){
            arr[i] = (int)((b1%10 + b2%10 + c)%2);
            //i++;
            c = (int)((b1%10+b2%10+c)/2);
            b1 = b1/10;
            b2 = b2/10;
            i++;
        }
        if(c!=0){
            arr[i] = c;
            i++;
        }
        System.out.println("the output is: ");
        i--;
        while(i>=0){
            System.out.print(arr[i]);
            i--;
        }
    }
}
