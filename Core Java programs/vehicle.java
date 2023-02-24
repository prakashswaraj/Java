
/*
*   Java program to implement the concept of constructor and inheritance...
* */

package com.company;

import java.util.Scanner;

public class vehicle {
    protected int licence_no;
    protected int speed;
    protected String color;
    protected String owner_name;
     vehicle(int lno,int s,String clr,String O_name)
    {
        licence_no = lno;
        speed = s;
        color = clr;
        owner_name = O_name;
    }
     void show_data()
    {
        //System.out.println("This is vehicle class: ");
        System.out.println("licence_no::" +licence_no);
        System.out.println("speed::" +speed);
        System.out.println("color::" +color);
        System.out.println("owner_name::" +owner_name);
    }
}
class Bus extends vehicle{
    protected  int route_no;
        Bus(int lno,int s,String clr,String O_name,int r_no)
    {
        super(lno,s,clr,O_name);
        route_no = r_no;
    }
    void show_data(){
        super.show_data();
        System.out.println("route_no::" +route_no);
    }
}
class car12 extends vehicle{
   protected String manufacturer_name ;
   car12(int lno,int s,String clr,String O_name,String m_name)
   {
       super(lno,s,clr,O_name);
       manufacturer_name = m_name;
   }
    void show_data()
   {
       super.show_data();
       System.out.println("manufacturer_name::" +manufacturer_name);
   }
}
class inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lno, s, r_no;
        String clr, O_name, m_name;
        while (true) {
            System.out.println("\n1.car\n2.BUS");
            System.out.println("Enter your choice");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("\nenter the necessaries: \nlicence no\nspeed\ncolor\nOwner name\nmanufacturer name: ");
                    lno = sc.nextInt();
                    s = sc.nextInt();
                    clr = sc.next();
                    O_name = sc.next();
                    m_name = sc.next();
                    car12 c = new car12(lno, s, clr, O_name, m_name);
                    c.show_data();
                    break;
                case 2:
                    System.out.println("\n Enter the following:\n licence no\nspeed\ncolor\nOwner name\nroute no: ");
                    lno = sc.nextInt();
                    s = sc.nextInt();
                    clr = sc.next();
                    O_name = sc.next();
                    r_no = sc.nextInt();
                    Bus b = new Bus(lno, s, clr, O_name, r_no);
                    b.show_data();
                    break;
                default:
                    System.out.println("invalid option");


            }
        }
    }
}