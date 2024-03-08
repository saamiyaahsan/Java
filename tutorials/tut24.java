
interface Bicycle{
     int a = 45;
     void applyBrake(int decrement);
     void speedup(int increment);
}

interface HornBicycle{
     
     int x = 45;
     void blowhorn3kg();
     void blowhornmhn();
}

class AvonCycle implements Bicycle,HornBicycle{
     
     void blowhorn(){
         System.out.println("Pee pee pee");
     }

     public void applyBrake(int decrement){
         System.out.println("Applying brake");
     }

     public void speedup(int increment){
         System.out.println("Applying speedUp");
     }

     public void blowhorn3kg(){
         System.out.println("Kabhi khushi kabhi gam..");
     }

     public void blowhornmhn(){
         System.out.println("Main hoon na poo poo..");
     }
}

public class helper{
     
     public static void main(String[] args){
          
          AvonCycle cycle = new AvonCycle();
          cycle.applyBrake(1);

          cycle.blowhorn3kg();
          cycle.blowhornmhn();
          
     }
}
