import java.util.*;

public class Assignment2{
     
     public static void main(String[] args){
          
          HashSet<String> st = new HashSet<>();
          st.add("Alice");
          st.add("Bob");
          st.add("John");

          Iterator itr = st.iterator();

          while(itr.hasNext()){
              System.out.println(itr.next());
          }
     }
}
