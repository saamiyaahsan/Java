class Calculate{
      
      int a;
      int b;

      Calculate(int a,int b){
          this.a = a;
          this.b = b;     
      }

      public int add(){
           return a+b;
      }
}

public class helper{
     
     public static void main(String[] args){
          
          Calculate calc = new Calculate(2,4);
          System.out.println(calc.add());
     }
}
