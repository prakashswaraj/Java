
/*
     Java code for checking whether an alphabet is vowel or consonant...
 */

package com.java_gfgs;

import java.util.Scanner;

public class vowelConstant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char  y = sc.next().charAt(0);
        if(y == 'a' || y =='e' || y == 'i' || y == 'o' || y == 'u'){
            System.out.println("is a vowel");
        }
        else{
        System.out.println("is a constant");
    }
}}

