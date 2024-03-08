abstract class pen{
     
     abstract void write();
     abstract void refill();
}

class fountainpen extends pen{
     
     public void write(){
         System.out.println("Writing");
     }

     public void refill(){
         System.out.println("Refilling");
     }

     public void changeNib(){
         System.out.println("Change the nib");
     }
}

public class helper{
     
     public static void main(String[] args){
          
          fountainpen f = new fountainpen();
          f.write();
          f.refill();
          f.changeNib();
          
     }
}
