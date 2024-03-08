import java.util.*;

public class helper extends Thread{
      
      public static void main(String[] args){

          System.out.println("The maximum value of long is: "+Long.MAX_VALUE);
          System.out.println("Current time in ms: "+System.currentTimeMillis());

          Date d = new Date();
          System.out.println("The current date is "+d);
      }
}
