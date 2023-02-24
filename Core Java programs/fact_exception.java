
/*
*     Java program o find the factorial  using exception handling....
* */

package com.company;

import java.util.Scanner;


     class factorial extends Exception {
         public String toString() {
             return "factorial is too long";
         }
     }

    class factorial1 {
       public static long fact(int n) throws factorial {
           if (n<0 ||n > 60) {
               throw new factorial();
           }
           long fact_res =1;
           for(int i = 1;i<=n;i++) {
                fact_res = fact_res*i;
           }
           return fact_res;
       }



     public static void main(String[] arg) {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the number:");
         int y = sc.nextInt();
         try {
             long x = fact(y);
             System.out.println(x);
         }
         catch (Exception e) {
             System.out.println("exception");
         }
     }
    }