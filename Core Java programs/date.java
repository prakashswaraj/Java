
/*
*    Java programs to print the current date and print the new date
*    after adding the number of days entered by the user...
* */

package com.company;

//import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Scanner;

public class date {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year [yyyy]  ");
        int y = sc.nextInt();
        System.out.println("enter the month [mm]  ");
        int m = sc.nextInt();
        System.out.println("enter the date [dd]");
        int d = sc.nextInt();
        LocalDate d1 = LocalDate.of(y,m,d);
        System.out.println(d1.toString());
        System.out.println("enter the no of days: ");
        int d3 = sc.nextInt();
        LocalDate d2 = d1.plusDays(d3);
        System.out.println("the new date is " +d2.toString());
    }
}
