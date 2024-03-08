class Employee{
     
     int salary;
     String name;

     public int getSalary(){
          return salary;
     }

     public String getName(){
         return name;
     }

     public void setName(String n){
         name = n;     
     }
}

class cellphone{
     
     public void ringing(){
         System.out.println("The phone is ringing!");
     }

     public void charging(){
         System.out.println("The phone is in charging mode!");
     }

     public void calling(){
         System.out.println("The phone is busy!");
     }
}

class Square{
     
     int side;

     public Square(int side){
         this.side = side;
     }

     public int getArea(){
          return side*side;
     }

     public int getPerimeter(){
         return 4*side;
     }
}

class tommy{
     
     public void hitting(){
         System.out.println("Hitting!");
     }

     public void running(){
         System.out.println("Running!");
     }

     public void slowing(){
         System.out.println("Slowing!");
     }
}

public class helper{
     
     public static void main(String[] args){ 
          
          Employee Rocky = new Employee();
          Rocky.salary = 101;
          Rocky.name = "Rocky";
          System.out.println(Rocky.getSalary());
          System.out.println(Rocky.getName());

          ////////////////////////////////

          cellphone phone = new cellphone();
          phone.ringing();
          phone.calling();
          phone.charging();

          /////////////////////////////////

          Square sq = new Square(5);
          System.out.println(sq.getArea());
          System.out.println(sq.getPerimeter());

          /////////////////////////////////

          tommy t = new tommy();
          t.hitting();
          t.running();
          t.slowing();
     }
}
