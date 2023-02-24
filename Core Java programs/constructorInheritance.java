
/*
*    Java programs to implement inheritance using constructor....
* */

package com.company;

public class constructorInheritance {
    public constructorInheritance(){
        System.out.println("I am the papa.");
    }
    public constructorInheritance(int a){
        System.out.println("I am also a papa with some value." + a);
    }
}
class beta extends constructorInheritance{
    public beta(){
        super(4);
        System.out.println("I am the son of papa.");
    }
    public beta(int b){
      // super(8);
        System.out.println("I am the beta with values"+ b);
    }
}
class uparwala{
    public static void main(String[] args) {
       // beta ankit = new beta();
        beta sahid  = new beta(5);
    }
}
