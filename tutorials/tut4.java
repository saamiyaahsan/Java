import java.util.*;

public class CWH extends Thread{
     
     public static void main(String[] args){
          
          HashSet<Integer> myHashSet = new HashSet<>(6,0.5f);

          myHashSet.add(6);
          myHashSet.add(3);
          myHashSet.add(8);
          myHashSet.add(11);

          System.out.println(myHashSet);
          
          System.out.println("myHashSet before removing any element "+myHashSet);
          myHashSet.remove(3);
          System.out.println("myHashSet after removal "+myHashSet);
          
          HashSet<Integer> myHashSet1 = new HashSet<>();

          System.out.println(myHashSet.isEmpty());
          System.out.println(myHashSet1.isEmpty());

          myHashSet1.add(20);

          System.out.println(myHashSet1);

          myHashSet1.clear();
          System.out.println(myHashSet1);
     }
}
