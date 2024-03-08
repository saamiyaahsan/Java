class Employee{
     
     int id;
     int salary;
     String name;

     public void PrintDetails(){
          
          System.out.println("My id is "+ id);
          System.out.println("My name is "+ name);
     }

     public int getSalary(){
          return salary;
     }
}

public class helper{
     
     public static void main(String[] args){
          
          System.out.println("This is our custom class");
          Employee John = new Employee();
          Employee Joe  = new Employee();

          John.id = 101;
          John.salary = 25000;
          John.name = "John";

          Joe.id = 102;
          Joe.salary = 30000;
          Joe.name = "Joe";

          John.PrintDetails();
          Joe.PrintDetails();

          System.out.println(John.getSalary());
          System.out.println(Joe.getSalary());
     }
}
