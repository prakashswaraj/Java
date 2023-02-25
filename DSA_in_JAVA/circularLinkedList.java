
/*
*   Java programs to perform circularLinked List....
 * */

package com.dsa_java;

import java.util.Scanner;

public class circularLinkedList {
   static class node{
        int data;
        node next;
    };
    static node addEmpty(node last, int data){
        if (last!=null){
            return last;
        }
        node temp = new node();
        temp.data = data;
        last= temp;
        last.next = last;
        return last;
    }
    static node addBeg(node last , int data){
        if(last == null){
            return addEmpty(last,data);
        }
        node temp = new node ();
        temp.data = data;
        temp.next = last.next;
        last.next = temp;
        return last;
    }
   static  node addLast(node last,int data){
        if(last == null){
            return addEmpty(last,data);
        }
        node temp = new node ();
        temp.data = data;
        temp.next = last.next;
        last.next = temp;
        temp  = last;
        return last;
    }
    static node addAfter(node last,int data,int item){
        if(last == null){
            System.out.println("list cannot  be null: ");
        }
        node temp,p;
        p = last.next;
        do{
            if(p.data == item){
                temp = new node();
                temp.data = data;

                temp.next = p.next;
                p.next = temp;
                if(p==last){
                    last = temp;
                    return last;
                }
                p= p.next;
            }
        }while(p!=last.next);
        System.out.println("the item is not present: ");
        return last;
    }
   static  void traverse(node last){
        node p;
        p = last.next;
        do{
            System.out.println(p.data  + " ");
            p= p.next;
        }while(p!=last.next);
    }

    public static void main(String[] args) {
        node last = null;
        Scanner sc = new Scanner(System.in);
       // System.out.println("enter the data:");
      //  int data = sc.nextInt();


       // for(int i = 0;i<10;i++){
            last = addEmpty(last,2);
            last = addBeg(last,12);
            last = addLast(last,15);
            last  = addLast(last,3);
           last = addAfter(last,4,15);
            last = addBeg(last,5);
            traverse(last);

    }
}
