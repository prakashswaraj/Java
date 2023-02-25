/*
*   Java programs to perform priority queue array...
 * */

package com.dsa_java;

public class priorityQueArray {
    public static class item
    {
        public int value;
        public int priority;
    };
  static class pqa
    {
       static item [] pq = new item[100];
       static int size = -1;
        public static void enqueue(int value , int priority)
        {
            size++;
            pq[size] = new item();
            pq[size].value = value;
            pq[size].priority = priority;
        }
        public static  int peek() {
            int highestPriority = Integer.MIN_VALUE;
            int ind = -1;
            for (int i = 0; i <= size; i++) {
                if (highestPriority == pq[i].priority && ind > -1 && pq[ind].value < pq[i].value) {
                    highestPriority = pq[i].priority;
                    ind = i;
                } else if (highestPriority < pq[i].priority) {
                    highestPriority = pq[i].priority;
                    ind = i;
                }
            }
            return ind;
        }
       static void dequeue()
        {
            int ind = peek();
            for(int i=ind;i<=size;i++)
            {
                pq[i] = pq[i+1];
            }
            size--;
        }
    }
}
class ma
{
    public static void main(String[] args) {
      //  priorityQueArray p = new priorityQueArray();\
        int ind;
        priorityQueArray.pqa.enqueue(10,2);
        priorityQueArray.pqa.enqueue(20,4);
        priorityQueArray.pqa.enqueue(60,10);
        priorityQueArray.pqa.enqueue(50,5);
         ind =priorityQueArray.pqa.peek();
        System.out.println(priorityQueArray.pqa.pq[ind].value);
        priorityQueArray.pqa.dequeue();

         ind =priorityQueArray.pqa.peek();
        System.out.println(priorityQueArray.pqa.pq[ind].value);
        priorityQueArray.pqa.dequeue();

        ind =priorityQueArray.pqa.peek();
        System.out.println(priorityQueArray.pqa.pq[ind].value);
        priorityQueArray.pqa.dequeue();

        ind =priorityQueArray.pqa.peek();
        System.out.println(priorityQueArray.pqa.pq[ind].value);
        priorityQueArray.pqa.dequeue();

    }
}
