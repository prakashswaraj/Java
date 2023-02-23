
/*
*   Exception is coming...
* */


import java.util.Scanner;

class rotateArray {
    public void rotateA(int [] arr,int n){
        int i;
        for(i=1;i<=n;i++){
            arr[++i]=arr[i];
            arr[i] = arr[n-i-1];
        }
        for(i=1;i<=n;i++){
            System.out.println(arr[i]);
        }
    }
}

public class driverDriver{
    public static void main(String[] args) {
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size: ");
         n= sc.nextInt();
         int  [] arr = new int[n];
        System.out.println("enter the array: ");
         for(i=1;i<=n;i++){
             arr[i]=sc.nextInt();
         }
         rotateArray ra = new rotateArray();
         ra.rotateA(arr,n);
    }
}
