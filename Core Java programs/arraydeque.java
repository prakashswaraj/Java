
/*
*        Java programs to implement arraydeque...
 * */

package com.company;

import java.util.ArrayDeque;

public class arraydeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.add(6);
        adq.add(7);
        adq.add(9);
        //adq.addFirst(5);
        //adq.offerFirst(21);
      //  adq.addLast(25);
       // adq.offerLast(35);
        adq.removeFirst();
        adq.peekFirst();
        System.out.println(adq.getFirst());
        System.out.println(adq.getLast());
    }
}
