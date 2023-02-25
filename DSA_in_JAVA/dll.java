
/*
* Java programs to perform doubly linked list....
 * */

package com.dsa_java;

import java.sql.SQLOutput;
import java.util.Scanner;

class dllSolution{
    node head = null;
    class node{
        int data;
        node next;
        node prev;
    }
    public void createDll(){
        int data;
        node ptr;
        System.out.println("enter -1 to end");
        System.out.println("enter the data");
        Scanner sc = new Scanner(System.in);
        data = sc.nextInt();
        while(data!=-1){
            node newNode = new node();
            if(head == null){
                newNode.data = data;
                newNode.next = null;
                newNode.prev = null;
                head = newNode;
            }
            ptr = head;
            newNode.data = data;
            while(ptr.next!=null){
                ptr = ptr.next;
            }
            ptr.next = newNode;
            newNode.prev = ptr;
            newNode.next = null;
            System.out.println("enter the data: ");
            data = sc.nextInt();
        }
    }

    public void displayList(){
        if(head == null){
            System.out.println("list is empty:");
        }
        node ptr = head;
        while(ptr!=null){
            {
                System.out.print(ptr.data + " ");
                ptr = ptr.next;
            }
        }
        System.out.println();
    }

    public void addBeg(){
        int data;
        node newNode  =new node();
        System.out.println("enter the data:");
        Scanner sc = new Scanner(System.in);
        data = sc.nextInt();
        if(head==null){
            newNode.data = data;
            newNode.next = null;
            newNode.prev = null;
            head  = newNode;
        }
        newNode.data = data;
        newNode.next = head;
        head.prev = newNode;
        newNode.prev = null;
        head = newNode;
    }
    public void addBefore(){
        int index,data;
        node ptr;
        node  newNode = new node();
        System.out.println("enter the index before the data is to be added: ");
        Scanner sc = new Scanner(System.in);
        index = sc.nextInt();
        System.out.println("enter the data:");
        data = sc.nextInt();
        newNode.data = data;
        if(head == null){
            System.out.println("list is empty: ");
            return;
        }
        ptr = head;
        if(ptr.data!=index){
            System.out.println("index is not present in the list.");
            return;
        }
        while(ptr.data!=index){
            ptr = ptr.next;
        }
        newNode.next = ptr;
        newNode.prev = ptr.prev;
        ptr.prev = newNode;
        ptr.prev.next = newNode;
    }
    public  void addAfter(){
        int data,index;
        node newNode = new node();
        node ptr;
        System.out.println("enter the index data: ");
        Scanner sc = new Scanner(System.in);
        index = sc.nextInt();
        System.out.println("enter the data: ");
        data = sc.nextInt();
        newNode.data = data;
        if(head == null){
            System.out.println("list is empty: ");
            return;
        }
        ptr = head;
        if(ptr.data != index){
            System.out.println("Invalid index data: ");
            return;
        }
        while(ptr.data!=index){
            ptr = ptr.next;
        }
        newNode.prev = ptr;
        newNode.next = ptr.next;
        ptr.next = newNode;
        ptr.next.prev = newNode;
    }
    public void addEnd(){
        int data;
        node newNode = new node();
        System.out.println("enter the data: ");
        Scanner sc = new Scanner(System.in);
        data = sc.nextInt();
        newNode.data = data;
        if(head == null){
            System.out.println("list is empty: ");
            return;
        }
        node last = head;
        while(last.next!=null){
            last = last.next;
        }
        last.next = newNode;
        newNode.prev = last;
        newNode.next = null;
    }
    public void deleteBeg(){
        if(head == null){
            System.out.println("list is empty: ");
            return;
        }
        int num;
        System.out.println("Enter the number to be deleted.");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        node ptr = head;
        if(ptr.data != num){
            System.out.println("Invalid data.");
        }
        head = head.next;
        return;
    }

    public void deleteEnd(){
        if(head==null){
            System.out.println("list is empty: ");
            return;
        }
        if(head.next== null){
            head = null;
            return;
        }
        node last = head;
        node ptr = head.next;
        while(ptr.next != null){
            ptr = ptr.next;
            last = last.next;
        }
        last.next = null;
    }
    public void deleteBefore(){
        int index;
        if(head == null){
            System.out.println("list is empty.");
            return;
        }
        System.out.println("enter the data to be deleted: ");
        Scanner sc = new Scanner(System.in);
        index = sc.nextInt();
        if(head.next == null || head.data==index){
            System.out.println("prev of head is not present:");
            return;
        }
        node temp = head;
        node ptr = head.next;
        while(ptr.data!=index) {
            temp = temp.next;
            ptr = ptr.next;
        }
        ptr.prev = temp.prev;
        temp.prev.next = temp.next;
    }
}

public class dll {
    public static void main(String[] args) {
        dllSolution dl = new dllSolution();
        int ch;
        do{
            System.out.print("1: create linked list.");
            System.out.print("2:display list");
            System.out.print("3: addBeg");
            System.out.print("4:addEnd");
            System.out.print("5:addBefore");
            System.out.print("6:addAfter");
            System.out.print("7:deleteBeg");
            System.out.print("8:deleteEnd");
            System.out.println("9:deleteBefore");
            System.out.print("10:Exit");
            System.out.print("Enter the choice: ");
            Scanner sc = new Scanner(System.in);
            ch = sc.nextInt();
            switch (ch){
                case 1:
                  dl.createDll();
                  break;
                case 2:
                    dl.displayList();
                    break;
                case 3:
                    dl.addBeg();
                    break;
                case 4:
                    dl.addBefore();
                    break;
                case 5:
                    dl.addAfter();
                    break;
                case 6:
                    dl.addEnd();
                    break;
                case 7:
                    dl.deleteBeg();
                    break;
                case 8:
                    dl.deleteEnd();
                    break;
                case 9:
                    dl.deleteBefore();
                    break;
                case 10:
                    System.out.println("Exit");
                    break;


            }
        }while (ch!=10);
    }
}
