/*
*   Java programs to check whether a string is palindrome or not ...
 * */

package com.dsa_java;

import java.util.Scanner;

public class palindromeString {
    boolean palindrome(String [] s , int left,int right){
        if(left>=right){
            return true;
        }
        if(s[left]!=s[right]){
            return false;
        }
        else {
            return palindrome(s, left + 1, right - 1);
        }
    }
}

class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the string: ");
        int n  = sc.nextInt();
        String [] s = new String[n];
        System.out.println("enter the string: ");
        for(int i=0;i<n;i++) {
            s[i] =sc.next();
        }

           int  l = 0;
           int  r =n-1;

           palindromeString ps = new palindromeString();
           boolean c = ps.palindrome(s,l,r);
        System.out.println(c);
    }
}
