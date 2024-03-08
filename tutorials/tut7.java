public class helper{
     
     public static void main(String[] args){
           
           int a = 6000;
           int b = 0;

           try{
                int c = a/b;
                System.out.println("The result "+c);
           }

           catch(Exception e){
               System.out.println("We failed to divide!");
               System.out.println(e);
           }

           System.out.println("End of code");
     }
}
