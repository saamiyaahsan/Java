
interface MyCamera{
     
     void takeSnap();
     void record4kvideo();

     void greet();
     default void record4kvideo(){
         greet();
         System.out.println("Recording in 4k..");
     }
}

interface myWifi{
     
     String[] getNetworks();
     void connectToNetwork(String network);
}

class myCellphone{
     
     void callNumber(int phonenumber){
         System.out.println("Calling "+phonenumber);
     }

     void pickCall(){
         System.out.println("Connecting");
     }
}

class mySmartPhone extends myCellphone implements myWifi,MyCamera{
     
      public void takeSnap(){
          System.out.println("Taking snap..");
      }

      public void record4kVideo(){
          System.out.println("Taking snap.");
      }

      public String[] getNetworks(){
          System.out.println("Getting a list of networks ");
          String[] networkList = {"Horse","Tiger","Elephant"};

          return networkList;
      }

      public void connectToNetwork(String network){
          System.out.println("Connecting to "+network);
      }
}

public class helper{
     
     public static void main(String[] args){
           
           mySmartPhone ms = new mySmartPhone();
           ms.record4kvideo();

           String[] ar = ms.getNetworks();

           for(String item : ar){
               System.out.println(item);
           }
     }
}

