class C1{
     
     public int x = 5;
     protected int y = 8;
     int z = 12;
     private int a = 9;
     
     private void meth1(){
         System.out.println(x);
         System.out.println(y);
         System.out.println(z);
         System.out.println(a);
     }
}

public class helper{
     
     public static void main(String[] args){

         C1 c = new C1();
         // c.meth1();  // not possible due to private access modifier type of variable a

         System.out.println(c.x);
         System.out.println(c.y);
         System.out.println(c.z);
         
         // System.out.println(c.a);  // same reason as stated above.
     }
}
