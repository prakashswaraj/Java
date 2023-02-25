/*
*     Java programs to remove duplicates from array...
 * */

package com.dsa_java;

public class removeDuplicate {
    node head;
    class node {
        int data;
        node next = null;
        node(int data)
        {
            this.data = data;
            next  = null;
        }
    }
    public void addBeg(int data)
    {
        node newnode = new node(data);
        if(head == null)
        {
            head  = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }
    public void printList()
    {
        node ptr = head;
        while(ptr!=null)
        {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
    }
    public void removeDuplicates(node head)
    {
        node ptr = head;
        node p = head.next;
        while(p.next!=null)
        {
            if(ptr.data==p.data)
            {
                ptr.next = p.next;
            }
            else
            {
                p = p.next;
                ptr = ptr.next;
            }
        }
        //return head;
    }


    public static void main(String[] args) {
        //node head  = null;
        removeDuplicate r = new removeDuplicate();
        r.addBeg(5);
        r.addBeg(4);
        r.addBeg(4);
        r.addBeg(2);
        r.addBeg(2);
        r.printList();
      // r.removeDuplicates(head);
        r.printList();
    }
}


