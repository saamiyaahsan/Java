public class helper{
      
      static void foo(){
            System.out.println("Hello");
      }

      static void foo(int a){
          System.out.println("Hello "+a);
      }

      static void foo(int a,int b){
          System.out.println("Hello "+a+" "+b);
      }

      public static void main(String[] args){
           
           foo();
           foo(2);
           foo(2,4);
      }
}
