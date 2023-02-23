
/*
*   Exception ...
* */

import java.util.Scanner;

public class duplicate {
    public int  findDup(int arr[],int n ) {
        int i = 0, j = 0, count = 1;
        int [] k = new int[n];
        for (i = 0; i <n ; i++) {
            if(i!=n-1) {
                for (j = i + 1; j < n; j++) {
                    if (i != j) {
                        if (arr[i] == arr[j]) {
                            count = count + 1;
                        }
                    }
                }
            }
            if (count >= 2) {
                k[i]= arr[i];
            }
            if (count == 1) {
                k[i]= arr[i];
            }
        }
        return k[i];
    }

}
class solution{
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter the elements of the array: ");
        for(i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        duplicate dp = new duplicate();
        int c = dp.findDup(arr, n);
        System.out.println(c);
    }
}
