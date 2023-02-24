
/*
*   Java program to implement different constructors....
* */

package com.company;

public class rectangle {
    private int l,b;
    public rectangle()
    {
         l = 15;
         b = 12;
    }
    public rectangle(int l,int b)
    {
        this.l = l;
        this. b = b;
    }

    public int getL() {
        return l;
    }

    public int getB() {
        return b;
    }
}
class constructor_overloading{
    public static void main(String[] args) {
        rectangle ob = new rectangle();
       rectangle ob1 = new rectangle(2, 4);
       System.out.println(ob.getL());
        System.out.println(ob.getB());
        System.out.println(ob1.getL());
        System.out.println(ob1.getB());
    }
}
