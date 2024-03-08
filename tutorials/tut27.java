// Dynamic Method Dispatch

class phone{
     
     public void showTime(){
         System.out.println("Time is 8 am");
     }

     public void on(){
         System.out.println("Phone is on...");
     }
}

class Smartphone extends phone{
     
     public void music(){
         System.out.println("Playing music..");
     }

     public void on(){
         System.out.println("Smartphone is on..");
     }
}

public class help{
     
     public static void main(String[] args){
          
          phone obj = new phone();
          Smartphone s = new Smartphone();

          obj.on();
          s.on();

          phone obj1 = new Smartphone();
          obj1.on();
     }
}
