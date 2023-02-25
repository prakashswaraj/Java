
/*
*  Java programs to perform linked list ...
 */

package com.dsa_java;

public class Linkedlist {
    //int size = 0;
    node  head;
    class node{
       String data;
       node next;
       node(String data){
           this.data = data;
           this.next  = null;
          // size++;
       }
    }
    public void addFirst(String data){
        node newNode = new node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        node newNode = new node(data);
        if(head == null){
            head = newNode;
            return;
        }
        node last = head;
        while(last.next!=null){
            last = last.next;
        }
        last.next = newNode;
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("list underflow");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        head = head.next;
    }

    public void deleteLast(){
        if(head== null){
            System.out.println("list underflow");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        node prev = head;
        node ptr = head.next;
        while(ptr.next!=null){
            ptr= ptr.next;
            prev = prev.next;
        }
        prev.next = null;
    }

    public void printData(){
        if(head == null){
            System.out.println("list is empty: ");
            return;
        }
        node curr  = head;
        while(curr!= null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
    public void reverseIterate(){
        if(head == null || head.next == null){
            return ;
        }
        node prev = head;
        node curr = head.next;
        while(curr!=null){
            node next = curr.next;
            curr.next=prev;
            prev = curr;
            curr = next;
        }
        head.next =  null;
        head =  prev;
    }

    public node reverseRecursive(node head){
        if(head == null || head.next == null){
            return head;
        }
        node newNode = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
    }

    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
       ll.addFirst("a");
        ll.addFirst("is");
        ll.addLast("list");
      ll.addFirst("this");
        //ll.deleteFirst();
        //ll.deleteFirst();
       // ll.deleteFirst();
      ll.printData();
     // ll.reverseIterate();
        ll.head = ll.reverseRecursive(ll.head);
        System.out.println(" ");
      ll.printData();
    }
}
