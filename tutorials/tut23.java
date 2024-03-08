interface Animal{
     // Default method
     default void say(){
         System.out.println("Hello, this is default method");
     }
     
    // Abstract Method 
     void bark();
}

public class CWH implements Animal{
     
     @Override
     public void bark(){
         System.out.println("Dog Barks!");
     }

     public static void main(String[] args){
          
          CWH obj1 = new CWH();
          obj1.bark();
          obj1.say();
     }
}
