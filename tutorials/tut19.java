interface basicAnimal{
     
     void eat();
     void sleep();
}

class Monkey{
     
     void jump(){
         System.out.println("Monkey jumps");
     }

     void bite(){
         System.out.println("Monkey bites");
     }
}

class Human extends Monkey implements basicAnimal{
     
     void speak(){
         System.out.println("Speaking");
     }

     @Override
     public void eat(){
         System.out.println("Eating");
     }
     
     @Override
     public void sleep(){
         System.out.println("Sleeping");
     }
}

public class Helper{
     
     public static void main(String[] args){
          
          Human H = new Human();
          H.sleep();

          Monkey M = new Human();
          M.jump();
          M.bite();
       //   M.sleep(); // This won't work! // polymorphism
     }
}
