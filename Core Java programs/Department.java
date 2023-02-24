
/*
*  Java programs to implement inheritance in java...
*
* */

package com.company;

import java.util.Scanner;

public interface Department {
    String depName = "Information Technology";
    String depHead = "Nandini Priya";
    abstract public void getData();
    abstract public void printData();
}
class Hostel {
     String hostelName;
     String hostelLocation;
     int noOfRooms;
     public void getData(String hn,String hl,int n)
     {
         hostelName = hn;
         hostelLocation = hl;
         noOfRooms = n;
     }
     public void printData(){
         System.out.println("hostelname" +hostelName);
         System.out.println("hostelLocation" +hostelLocation);
         System.out.println("noOfRooms" +noOfRooms);
     }
}
class Student extends Hostel implements Department{
     String dept_name,dept_head;
     String studentName;
     int regNo;
     String electiveSubject;
     double avgMarks;
     public void getData(){
       dept_name =  depName ;
       dept_head = depHead;
     }
     public void getData(String s_name,int regNo,String eSub,double av_marks){
         studentName = s_name;
         this.regNo = regNo;
         electiveSubject = eSub;
         avgMarks = av_marks;
     }
     public void printData()
     {
         System.out.println("the department name is: "+dept_name);
         System.out.println("the department head is: "+dept_head);
         System.out.println("the student name is" +studentName);
         System.out.println("the registration no is: "+regNo);
         System.out.println("the elective subject is: "+electiveSubject);
         System.out.println("the average mark is: "+avgMarks);
     }
}
class Swaraj2812811{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the necessary details of the student:\n1.name\n2.registration no.\n3.elective subject\n4.average marks");
        String s = sc.nextLine();
        int r_no = sc.nextInt();
        String esub = sc.next();
        double marks = sc.nextDouble();
        Student std = new Student();
        std.getData();
        std.getData(s,r_no,esub,marks);
        std.printData();
    }
}
