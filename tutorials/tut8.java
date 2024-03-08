import java.util.Scanner;

abstract class Shape{
     
     abstract double calculate_area();
     abstract double calculate_perimeter();
}

class Circle extends Shape{
     
     double radius;

     Circle(double r){
         this.radius = r;
     }

     @Override
     public double calculate_area(){
          
          return Math.PI*(this.radius)*(this.radius);
     }

     @Override
     public double calculate_perimeter(){
          
          return 2*Math.PI*(this.radius);
     }
}

class Rectangle extends Shape{
      
      double length;
      double width;

      Rectangle(double l,double w){
          this.length = l;
          this.width = w;
      }

      @Override
      public double calculate_area(){
           return (this.length)*(this.width);
      }

      @Override
      public double calculate_perimeter(){
          return 2*(this.length + this.width);
      }
}

class Triangle extends Shape{
      
      double base;
      double height;
      double s1;
      double s2;
      double s3;

      Triangle(double base,double height,double s1,double s2,double s3){
          this.base = base;
          this.height = height;
          this.s1 = s1;
          this.s2 = s2;
          this.s3 = s3;
      }

      @Override
      public double calculate_area(){
           
           double area = 0.5*(this.base)*(this.height);

           return area;
      }

      @Override
      public double calculate_perimeter(){

          double peri = s1 + s2 + s3;

          return peri;
      }
}

public class helper{
     
     public static void main(String[] args){
           
           Scanner sc = new Scanner(System.in);

           double r = sc.nextDouble();
           double l = sc.nextDouble();
           double w = sc.nextDouble();
           double base = sc.nextDouble();
           double height = sc.nextDouble();
           double s1 = sc.nextDouble();
           double s2 = sc.nextDouble();
           double s3 = sc.nextDouble();

           Circle circle = new Circle(r);
           Rectangle rectangle = new Rectangle(l,w);
           Triangle triangle = new Triangle(base,height,s1,s2,s3);

           double circleArea = circle.calculate_area();
           double circlePerimeter = circle.calculate_perimeter();
           double rectangleArea = rectangle.calculate_area();
           double rectanglePerimeter = rectangle.calculate_perimeter();
           double triangleArea = triangle.calculate_area();
           double trianglePerimeter = triangle.calculate_perimeter();

           System.out.println(circleArea);
           System.out.println(circlePerimeter);
           System.out.println(rectangleArea);
           System.out.println(rectanglePerimeter);
           System.out.println(triangleArea);
           System.out.println(trianglePerimeter);

           sc.close();
     }
}
