
// Creating a Thread by extending thread class

class MyThread1 extends Thread{
     
     @Override
     public void run(){
          
          int i = 0;

          while(i < 5){
              System.out.println("My cooking thread is running!");
              i++;
          }
     }
}

class MyThread2 extends Thread{
     
     @Override
     public void run(){
          
          int i = 0;

          while(i < 4){
              System.out.println("Blah Blah Blah");
              i++;
          }
     }
}

public class helper{
     
     public static void main(String[] args){
           
           MyThread1 t1 = new MyThread1();
           MyThread2 t2 = new MyThread2();

           t1.start();
           t2.start();
     }
}
