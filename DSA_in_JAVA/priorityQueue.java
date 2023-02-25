
/*
*  Java programs to perform priority queue using queue interface in collection framework...
 * */

package com.dsa_java;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class priorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();//by default it makes a min heap
        PriorityQueue<Integer> pq1  =new PriorityQueue<>(Collections.reverseOrder());
        pq.add(5);
        pq.add(15);
        pq.add(10);
        pq.add(2);
        pq1.add(5);
        pq1.add(15);
        pq1.add(10);
        pq1.add(2);
        while(!pq.isEmpty())
        {
            System.out.println(pq.peek());
            pq.poll();
        }
        System.out.println("The below elements are acc. to max heap: ");
        while(!pq1.isEmpty())
        {
            System.out.println(pq1.peek());
            pq1.poll();
        }
    }
}
