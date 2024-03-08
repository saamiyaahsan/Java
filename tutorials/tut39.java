// Varargs 
public class calculate{
      
      static int add(int ...arr){
           
           int result = 0;

           for(int i : arr){
               result = result + i;
           }

           return result;
      }

      public static void main(String[] args){
           
           System.out.println(add());
           System.out.println(add(1));
           System.out.println(add(2,3));
      }
}
