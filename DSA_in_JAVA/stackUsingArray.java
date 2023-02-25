
/*
*     Java programs to implement stack using array...
 * */

package com.dsa_java;

public class stackUsingArray {
    int max = 100;
    int top;
    int arr[] = new int [max];
    public void push(int data){
        if(top>=max-1){
            System.out.println("Stack overflow");
            return;
        }
        top = top + 1;
        arr[top] = data;
    }
    public int pop(){
        if(top<0){
            System.out.println("Stack underflow");
            return -1;
        }
        int data = top;
        top = top - 1;
        return arr[data];
    }
    public int peek(){
        if(top<0){
            System.out.println("Stack underflow");
            return -1;
        }
        return arr[top];
    }
    public boolean isEmpty(){
        if(top<0)
            return true;
        return false;
    }
    public void printStack(){
        if(top<0){
            System.out.println("stack underflow");
            return;
        }
        for(int i = top ; i>-1;i--){
            System.out.println(arr[i]);
        }
    }
}
class stackArray{
    public static void main(String[] args) {
        stackUsingArray s  = new stackUsingArray();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
//        while(!s.isEmpty()){
//            System.out.println(s.peek());
//            s.pop();
//        }
        s.printStack();
    }
}
