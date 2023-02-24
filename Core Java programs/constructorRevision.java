
/*
*  Java programs to implement default constructor and constructor using fields...
*
* */

package com.company;

public class constructorRevision {
    private int id;
    private String name;
    public constructorRevision(){
        id = 13;
        name = "Swaraj";
    }
    public constructorRevision(int id,String name){
       this. id = id;
       this. name = name;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
}
class revision{
    public static void main(String[] args) {
        constructorRevision cr0 = new constructorRevision();
        constructorRevision cr = new constructorRevision(12,"nandini");
        System.out.println(cr.getName());
        System.out.println(cr.getId());
        System.out.println(cr0.getName());
        System.out.println(cr0.getId());
    }
}