abstract class Parent2{ 
     
     public Parent2(){
         System.out.println("Mai base2 ka constructor hoon!");
     }
     
     public void SayHello(){
         System.out.println("Hello");
     }

     abstract public void greet();
     abstract public void greet2();
}

class Child2 extends Parent2{
   
     @Override
     public void greet(){
          System.out.println("Good Morning");
     }

     @Override
     public void greet2(){
         System.out.println("Good afternoon");
     }
}

abstract class Child3 extends Parent2{
     
     public void th(){
          System.out.println("Say Hello");
     }
}

public class helper{
     
     public static void main(String[] args){
          
          // Parent2 p = new Parent2();
          // Child3 c = new Child3();

          Child2 c = new Child2();    
     }
}
