
interface TVremote{
     void on();
     void off();
}

interface SmartTVremote extends TVremote{
     void switching();
}

class TV implements TVremote,SmartTVremote{
     
     public void channel(){
         System.out.println("The channel in progress");
     }

     @Override
     public void on(){
         System.out.println("On ho gya");
     }

     @Override
     public void off(){
         System.out.println("Off ho gya");
     }

     @Override
     public void switching(){
         System.out.println("Switching chal rahi hai");
     }
}

public class helper{
     
     public static void main(String[] args){ 

         TV t = new TV();
         t.on();
         t.off();
         t.switching();
         t.channel();

         SmartTVremote s = new TV();  // TV working as SmartTV ka remote
         s.switching();
         
         TVremote T = new TV();  // TV working as a Tv ka remote
         T.on();
         T.off();
    }
}
