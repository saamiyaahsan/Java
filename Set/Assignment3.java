import java.util.*;

public class Assignment3{
       
       public static void main(String[] args){
            
            TreeSet<String> set = new TreeSet<>();
            set.add("Bob");
            set.add("Alice");
            set.add("John");

            System.out.println("Original Tree set: "+ set);

            Iterator<String> itr = set.descendingIterator();
            System.out.println("Elements in descending order: ");

            while(itr.hasNext()){
                 System.out.println(itr.next());
            }

            Iterator<String> itr2 = set.iterator();
            String query = "Sahil";
            boolean result = false;

            while(itr2.hasNext()){
                 
                 if(itr2.next().equals("Sahil")){
                       result = true;
                       break;
                 }
            }

            if(result){
                System.out.println(query+" Exists");
            }

            System.out.println(query+" doesn't exists");
       }
}
