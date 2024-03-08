class Circle{
     
     public int radius;

     public Circle(){
         System.out.println("I am non param of circle");
     }

     public Circle(int r){
         System.out.println("I am circle parameterized circle");
         this.radius = r;
     }

     public double area(){
          return Math.PI*radius*radius;
     }
}

class Cylinder1 extends Circle{
     
     public int height;

     Cylinder1(int r,int h){
         super(r);
         System.out.println("I am cylinder1 parameterized constructor!");
         this.height = h;
     }

     public double Volume(){
         return Math.PI*this.radius*this.radius*this.height;
     }
}

public class helper{
     
     public static void main(String[] args){
          
          Circle c = new Circle(5);
          System.out.println("The are of circle is "+c.area());
          Cylinder1 cyr = new Cylinder1(5,10);
          System.out.println("The volume of cylinder is "+cyr.Volume());
     }
}
