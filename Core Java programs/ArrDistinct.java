

/*
*     Java programs to check whether the elements of the array is distinct or not...
 * */

package com.company;

import java.util.Scanner;

public class ArrDistinct {
    public static void main(String[] args) {
        int i,j,count=0;
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int n = sc.nextInt();
        int [] ar  = new int [n];
        System.out.println("enter the elements of the array: ");
        for(i=0;i<n;i++) {
            ar[i] = sc.nextInt();
        }
        for(i=0;i<n;i++){
            count=0;
            for(j=0;j<n;j++) {
                if (i != j) {
                    if (ar[i] == ar[j]) {
                        count++;
                    }
                }
            }
            if(count==0){
                System.out.println(ar[i]);
            }
        }
    }
}
