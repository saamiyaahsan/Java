public class tut11{
     
     public static void tellJoke(){
         System.out.println("Hello! \n" + "World!");
     }

    public static int logic_alpha(int x,int y){

         int z;

         if(x > y){
             z = x + y;
         }

         else{
             z = (x + y) + 5;
         }

         return z;
     }

     public static void main(String[] args){
         int a = 5;
         int b = 7;
         int c;

         c = logic_alpha(a,b);
         System.out.println(c);
         tellJoke();

     }
}
