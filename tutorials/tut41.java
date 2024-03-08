class Calculate{
     
     int multiply(int a,int b){
          return a*b;
     }

     int multiply(int a,int b,int c){
          return a*b*c;
     }
}

public class helper{
     
     public static void main(String[] args){
          Calculate calc = new Calculate();

          System.out.println(calc.multiply(2,3));
          System.out.println(calc.multiply(1,3,5));
     }
}
