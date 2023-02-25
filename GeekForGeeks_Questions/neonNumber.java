
/*
   Java Code for checking the number is neon or not.
*/

package com.java_gfgs;

import java.util.Scanner;

public class neonNumber {
    public void checkNeon(int data){
        int c,n,sum=0;
        c = data*data;

        while(c!=0){
            n= c;
           n = n%10;
           sum = sum + n;
           c = c/10;
        }
        if(sum == data){
            System.out.println("the number is neon number.");
        }
        else{
            System.out.println("not a neon number.");
        }

    }
}
class neon{
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        System.out.println("enter the number: ");
        int x = sc.nextInt();
        neonNumber n = new neonNumber();
        n.checkNeon(x);
    }


}
