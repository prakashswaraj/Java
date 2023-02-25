/*
*     Java programs to reverse the linked list....
 * */

package com.dsa_java;

public class reverseLL {
    node head;
    class node{
        int data;
        node next;
        node(int data){
            this.next = null;
            this.data = data;
        }
    }
    public void addFirst(int data){
        node newnode = new node(data);
        if(head == null){
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }
    public void reverseIterate(){
        if(head == null || head.next == null){
            return;
        }
        node prevnode = head;
        node curr = head.next;
        while(curr!=null){
            node next = curr.next;
            curr.next = prevnode;
            prevnode = curr;
            curr= next;
        }
        head.next = null;
        head = prevnode;
    }
    public node reverseRecursive(node head){
        if(head==null || head.next == null){
            return head;
        }
        node newhead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newhead;
    }
    public node middle(node head){
        node slow = head;
        node fast = head;
        while(fast!= null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public void printList(){
        if(head == null){
            System.out.println("list is empty: ");
            return;
        }
        node curr = head;
        while(curr!=null){
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
    }


    public static void main(String[] args) {
        node head ;
        reverseLL re = new reverseLL();
        re.addFirst(73);
        re.addFirst(61);
        re.addFirst(93);
        re.addFirst(51);
      //  re.addFirst(1);
        re.printList();
        re.reverseIterate();
       // node mid = re.middle(head);
      //  System.out.println(mid);
       //node last = re.reverseRecursive(mid.next);
        System.out.println(" ");
        re.printList();

    }
}
