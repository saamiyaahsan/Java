import java.util.*;

public class Assignment3{
     
     public static void main(String[] args){
          
          ArrayList<String> list = new ArrayList<>();
          list.add("Item 1");
          list.add("Item 2");
          list.add("Item 3");
          list.add("Item 4");
          list.add("Item 5");

          printAll(list);
     }

     static void printAll(ArrayList<String> list){

         Iterator<String> itr = list.iterator();

         while(itr.hasNext()){
             System.out.println(itr.next());
         }
     }
}
