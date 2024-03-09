import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class tut_ArrayList{
     
    public static void main(String[] args){
         
         List<Integer> res = new LinkedList<>();

         res.add(10);
         res.add(20);
         res.add(30);
         res.add(40);
         //res.remove(res.size()-1);
         for(int it : res){
             System.out.println(it);
         }

         for(int i=0;i<res.size();i++){
             System.out.println(res.get(i));
         }
    }

}
