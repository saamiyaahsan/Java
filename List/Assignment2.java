
import java.util.*;

class Employee{
     private int empid;
     private String empName, email, gender;
     private float salary;

     Employee(int empid, String empName, String empEmail, String empGender, float empSalary){
         this.empid = empid;
         this.empName = empName;
         email = empEmail;
         gender = empGender;
         salary = empSalary;
     }

     public int getEmpid(){
          return empid;
     }

     public String getEmail(){
           return email;
     }
     
     public String getGender(){
         return gender;
     }

     public float getSalary(){
         return salary;
     }

     void GetEmployeeDetails(){
         System.out.println("Employee[Empid=" + empid + ", EmpName=" + empName + ", Empemail=" + email + ", EmpGender=" + gender + ", EmpSalary=" + salary + "]");
     }
}

class EmployeeDB{
     
     List<Employee> employeeDb = new ArrayList<>();

     public boolean addEmployee(Employee e){
         return employeeDb.add(e);
     }

     public boolean deleteEmployee(int empid){

         boolean isRemoved = false;

         Iterator<Employee> it = employeeDb.iterator();

         while(it.hasNext()){
             Employee emp = it.next();

             if(emp.getEmpid() == empid){
                 isRemoved = true;
                 it.remove();
             }
         }

         return isRemoved;
     }

     public String showPaySlip(int empid){
          
          String paySlip = "Invalid employee id";

          for(Employee e : employeeDb){
              if(e.getEmpid() == empid){

                  paySlip = "Pay slip for employee id " + empid + " is " + e.getSalary();
              }
          }

          return paySlip;
     }

     public Employee[] listAll(){
          
          Employee[] empArray = new Employee[employeeDb.size()];

          for(int i=0;i<employeeDb.size();i++){
               empArray[i] = employeeDb.get(i);
          }

          return empArray;
     }
}

public class Assignment2{
     
     public static void main(String[] args){
          
          EmployeeDB empDb = new EmployeeDB();

          Employee emp1 = new Employee(101, "Bob", "bob@gmail.com", "Male", 25000);
          Employee emp2 = new Employee(102,"Alice", "alice@reddifmail.com", "Female", 30000);
          Employee emp3 = new Employee(103,"John","john@ymail.com","Male", 20000);
          Employee emp4 = new Employee(104,"Anthony","anthony@outlook.com","Male",50000);

          empDb.addEmployee(emp1);
          empDb.addEmployee(emp2);
          empDb.addEmployee(emp3);
          empDb.addEmployee(emp4);

          for(Employee emp : empDb.listAll()){
              emp.GetEmployeeDetails();
          }

          System.out.println();

          empDb.deleteEmployee(102);

          for(Employee emp : empDb.listAll()){
              emp.GetEmployeeDetails();
          }

          System.out.println();
          System.out.println(empDb.showPaySlip(103));
     }
}
