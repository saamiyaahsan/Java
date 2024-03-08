import java.util.*;

public class helper extends Thread{
       
       public static void main(String[] args){
            
            ArrayDeque<Integer> dq = new ArrayDeque<>();
            dq.add(10);
            dq.add(20);
            dq.add(30);
            dq.addFirst(34);
            dq.addLast(40);
            System.out.println(dq.getFirst());
            System.out.println(dq.getLast());
       }
}
