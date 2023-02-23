
/*
*   Java code for finding the folded array sum...
* */

import java.util.Scanner;



public class foldedArray {
    public static void main(String[] args) {
        int n,i,j;
        Scanner sc = new Scanner(System.in);
       System. out.println("enter the length of the array: ");
        n = sc.nextInt();
        int [] arr = new int [n];
       System. out.println("enter the elements of the array: ");
        for(i = 1;i<=n;i++){
            arr[i] = sc.nextInt();
        }
        if(n%2==1){
                for(i=1;i<=n;i++) {
                    if (i != n ) {
                        arr[i] = arr[i] + arr[n - i + 1];
                    }
                        System.out.println(arr[i]);
                }

        }

    }
}
