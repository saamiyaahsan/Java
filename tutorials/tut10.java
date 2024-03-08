
class MyThr extends Thread{
     
     public MyThr(String name){
         super(name);
     }

     public void run(){
         int i = 34;
         System.out.println("Thank you");
     }
}

public class helper{

    public static void main(String[] args){
        MyThr t1 = new MyThr("John");
        MyThr t2 = new MyThr("Joe");

        t1.start();
        t2.start();
        System.out.println(t1.getId());
        System.out.println(t2.getName());
    }
}
