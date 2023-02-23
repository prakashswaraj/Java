/*
*   Java code for checking whether an array is lucky or not ....
* */


import java.util.Scanner;

public class luckyarray {
    public static void main(String[] args) {
        int i,j,n;
        int count = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        n= sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter the elements of the array: ");
        for(i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count == arr[i]){
                System.out.println(arr[i]);
            }
        }
        while(count!=1){
            count--;
        }
    }
}
