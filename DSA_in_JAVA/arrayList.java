
/*
*   Java program to perform arrayList...
* */

package com.dsa_java;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>(1);
        l.add(5);
        l.add(10);
        l.add(15);
        l.add(20);
        l1.add(13);
        l1.add(26);
        l1.add(39);
        l1.addAll(0,l);
     //   l.add(2,25);
        for(int i=0;i<l1.size();i++){
            System.out.print(l1.get(i));
            System.out.print(" ");
        }
        System.out.println(l.contains(20));
        System.out.println(l.contains(12));
        System.out.println(l.contains(14));

    }
}
