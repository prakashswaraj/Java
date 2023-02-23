
/*
*   Java code for calculating alternate sum of a given array....
* */


import java.util.Scanner;

public class alternateSum {
    public static void main(String[] args) {
        int i,n,sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size: ");
        n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("enter the elements of the array:");
        for(i=1;i<=n;i++){
            arr[i] = sc.nextInt();
        }
        try {
            if (n % 2 == 1) {
                for (i = 1; i <= n; i++) {
                    sum = sum + arr[2 * i - 1];
                }
                System.out.println(sum);
            }

            if (n % 2 == 0) {
                for (i = 1; i <= n / 2; i++) {
                    sum = sum + arr[2 * i - 1];
                }
                System.out.println(sum);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
