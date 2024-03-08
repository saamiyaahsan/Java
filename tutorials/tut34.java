class Employee{
     
     public Employee(String s,int i){
         System.out.println("The name of employee is "+s);
         System.out.println("The id of employee is "+i);
     }

     public Employee(String s,int i,int salary){
         System.out.println("The name of employee is "+s);
         System.out.println("The id of employee is "+i);
         System.out.println("The salary of employee is "+salary);
     }
}

public class helper{
     
     public static void main(String[] args){
          
          Employee Jack = new Employee("Jack",101);
          Employee Joe = new Employee("Joe",102,100000);
          
     }
}
