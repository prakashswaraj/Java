/*
*   Java programs to find the power set of an array...
 * */

package com.dsa_java;

import java.util.Scanner;

public class powerset {
    void powers(String[] s ,int i,String cur){
        if(i==s.length){
            System.out.println(cur);

        }
        else{
            powers(s,i+1,cur+s[i]);
            powers(s,i+1,cur);
        }

    }
}
class solutions{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size : ");
        int n = sc.nextInt();
        String [] s =  new String[n];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        int x = 0;
        String cur="" ;
        powerset p = new powerset();
        p.powers(s,x,cur);
    }
}
