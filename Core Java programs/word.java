
/*
*   Java program to reverse the string ....
* */

package com.company;

import java.util.Scanner;

public class word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name: ");
        String name = sc.next();
        String rev = " ";
        // int len= name.length();
       /* for(int i=len-1;i>=0;i--){
            rev= rev+name.charAt(i);
        }
        */
        System.out.println(rev);
        char a[] = name.toCharArray();
        int len = a.length;
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + name.charAt(i);
        }
        System.out.println(rev);
    }
}
