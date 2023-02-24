
/*
*     Java programs to implement constructor....
 * */

package com.company;

import java.time.LocalDate;

import java.util.Scanner;

public class baby {
    String name;
    String   DOB;
    String polio_drop_date;
    public baby(String nam,String dob, String pdd)
    {
        name = nam;
        DOB = dob;
        polio_drop_date = pdd;
        System.out.println("the name of the baby is: "+name);
        System.out.println("the DOB of the baby is: "+DOB);
        System.out.println("the polio drop date is: "+pdd);
    }
}
class Baby_health{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name of the baby: ");
        String nam =sc.nextLine();
        System.out.println("enter the year [yyyy] ");
        int y = sc.nextInt();
        System.out.println("enter the month [mm]  ");
        int m = sc.nextInt();
        System.out.println("enter the date [dd]  ");
        int d = sc.nextInt();
        LocalDate d1 = LocalDate.of(y,m,d);
        LocalDate d2 = d1.plusDays(45);
        baby b = new baby(nam,d1.toString(),d2.toString());
    }
}
