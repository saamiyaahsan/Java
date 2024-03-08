
abstract class Telephone{
     
     abstract void lift();
     abstract void disconnected();
}

class SmartTelephone extends Telephone{
      
      public void videoCall(){
          System.out.println("Video calling!");
      }

      @Override
      public void lift(){
          System.out.println("Lift is on");
      }
      
      @Override
      public void disconnected(){
          System.out.println("Lift is disconnected");
      }
}

public class helper{
     
     public static void main(String[] args){

         SmartTelephone st = new SmartTelephone();
         st.lift();
         st.disconnected();

         Telephone t = new SmartTelephone();  // SmartTelephone as a Telephone
         t.lift();
         t.disconnected();
       //  t.videoCall();  // this is the feature of smartTelephone , hence won't work
     }
}
