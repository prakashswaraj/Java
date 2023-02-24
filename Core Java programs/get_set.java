
/*
*   Java programs to implement  getters nd setters ...
* */
package com.company;

public class get_set {
    private int radius ;
    private int height ;
  //  public  void area (int radius,int height)
    //{
      // double area1 = 2*3.14*radius*height;
        //System.out.println("the area of the cylinder is " +area1);
    //}
    //public void volume (int radius ,int height)
    //{
      //  double v = 3.14 *radius*radius*height;
        //System.out.println("the volume of the cylinder is " +v);
    //}
    public double area ()
    {
        return 2*3.14*radius*height;
    }
    public double volume()
    {
        return 3.14*radius*radius*height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
class cylinder {
    public static void main(String[] args) {
        get_set ob = new get_set();
        ob.setHeight(12);
        ob.setRadius(15);
        System.out.println(ob.getHeight());
        System.out.println(ob.getRadius());
       // ob.area(12,15);
        //ob.volume(12,15);
        System.out.println(ob.area());
        System.out.println(ob.volume());
    }

}



