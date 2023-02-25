
/*
*   Java programs to perform linked list in collection framework...
 */

package com.dsa_java;

import java.util.*;

public class LL {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");
        list.addLast("list");
       // System.out.println(list);
        list.remove(1);
        list.removeLast();
        list.size();


        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println(list.size());
    }
}
