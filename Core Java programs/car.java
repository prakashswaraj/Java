
/*
*   Java program to perform the functionality of  a car by creating class , initializing
*   object and methods...
* */

package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class car {
    int speed;
    public void carStart()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the speed of the car: ");
        speed = sc.nextInt();
        if(speed>200)
            System.out.println("speed of the car cannot exceed more than 200");
        if(speed==200)
            System.out.println("the speed of the car is 200");
    }
    public void carSlow()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the speed of the car:");
        speed = sc.nextInt();
        if(speed<0)
            System.out.println("speed of the car cannot be negative:");
        if(speed==0)
            System.out.println("speed of the zero");
        if(speed>0 && speed<200) {
            speed = speed - 20;
            System.out.println("the speed of the car is: " + speed);
        }
    }
    public void carFast()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the speed of the car:");
        speed = sc.nextInt();
        if(speed>200)
            System.out.println("car must not be accelerated to aspeed more than 200!");
        else {
            speed += 30;
            System.out.println("the speed of the car is: " + speed);
        }
    }
    public void printSpeed()
    {
        System.out.println("the current speed of the car is: "+speed);
    }
}
 class Day1_2
{
    public static void main(String[] args) {
        int ch;
        Scanner sc = new Scanner(System.in);
        do{
        car obj = new car();
        System.out.println("\n1.carstart\n2.carslow\n3.carfast\n4.printspeed\n5.EXIT");
        System.out.println("enter the choice: ");
         ch = sc.nextInt();
            switch (ch) {
                case 1:
                    obj.carStart();
                case 2:
                    obj.carSlow();
                    break;
                case 3:
                    obj.carFast();
                    break;
                case 4:
                    obj.printSpeed();
                    break;
                case 5:
                    System.out.println("invalid option.you can EXIT.");
            }
        }
        while( ch!=5);

    }
}
