
/*
*   Java program to find the transpose of the matrix...
* */

package com.company;

import java.util.Scanner;

public class transposeMatrix {
    public static void main(String[] args) {
        int m,n,i,j, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of rows of the matrix: ");
        m = sc.nextInt();
        System.out.println("enter the no. of column of the matrix: ");
        n = sc.nextInt();
        int [][]arr = new int [m][n];
        System.out.println("enter the elements of the matrix: ");
        for(i = 0 ; i < m ; i++){
            for(j = 0 ; j < n ; j++) {
                arr[i][j] = sc.nextInt();
            };
        }
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                System.out.println(arr[i][j]);
            }
            System.out.println("\n");
        }
      /*  for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(i!=j){
                    temp = arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
                }
            }
        }*/
        System.out.println("the transposed matrix is");
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                System.out.println(arr[i][j]);
            }
            System.out.println("\n");
        }
    }
}
