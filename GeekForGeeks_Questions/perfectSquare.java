
/*
    Java code for counting triplets ....
* */

package com.java_gfgs;

import java.util.Scanner;

public class perfectSquare {
        public int countTriples(int n) {
            int count = 0;
            int a = 1,b = a+1,c = b+1;
            while((a>=1 && a<=n) && (b>=1 && b<=n) && (c>=1 && c<=n)){
                int sum = a*a + b*b;
                int x = c*c;
                if(sum == x){
                    count++;
                    count = 2*count;
                }
                if(count==0){
                    a++;b++;c++;
                    continue;
                }
               // continue;
                 if((2*a>=1 && 2*a<=n) && (2*b>=1 && 2*b<=n) && (2*c>=1 && 2*c<=n)){
                    a = 2*a;
                    b = 2*b;
                    c = 2*c;
                }
            }
            return count;
        }
    }

    class perfect{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the number");
            int n = sc.nextInt();
            perfectSquare  ps  = new perfectSquare();
            int ans = ps.countTriples(n);
            System.out.println(ans);
        }
    }

