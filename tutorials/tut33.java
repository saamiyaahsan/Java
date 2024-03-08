import java.util.*;

class Cylinder{
     
     private int radius;
     private int height;

     public Cylinder(int radius,int height){
          this.radius  = radius;
          this.height = height;
     }

     public int getRadius(){
          return radius;
     }

     public void setRadius(int radius){
         this.radius = radius;
     }

     public int getHeight(){
         return height;
     }

     public void setHeight(int height){
         this.height = height;
     }

     public double SurfaceArea(){
          return 2*Math.PI*radius*height + 2*Math.PI*radius*radius;
     }

     public double Volume(){
         return Math.PI*radius*radius*height;
     }
}

public class helper{
     
     public static void main(String[] args){
          
          Cylinder myCylinder = new Cylinder(5,10);
          myCylinder.setRadius(5);
          myCylinder.setHeight(10);
          System.out.println(myCylinder.getHeight());
          System.out.println(myCylinder.getRadius());
          System.out.println(myCylinder.SurfaceArea());
          System.out.println(myCylinder.Volume());
     }
}
