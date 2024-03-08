
class Thread1 extends Thread{
     
     @Override
     public void run(){

         while(true){
             System.out.println("Welcome");
         }
     }
}

class Thread2 extends Thread{

    @Override
    public void run(){

        while(true){
            System.out.println("Hello");
        }
    }
}

public class helper{
     
     public static void main(String[] args){

         Thread t1 = new Thread();
         Thread t2 = new Thread();

         t1.start();
         t2.start();
     }
}
