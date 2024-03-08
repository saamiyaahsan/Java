
class Base1{
     
     Base1(){
         System.out.println("I am in base constructor");
     }

     Base1(int x){
         System.out.println("I am in base constructor "+x);
     }
}

class Derived1 extends Base1{
     
     Derived1(){
         System.out.println("I am in derived constructor");
     }

     Derived1(int x,int y){
         super(x);

         System.out.println("I am an overloaded constructor with the derived value of y as "+y);
     }
}

class ChildOfDerived1 extends Derived1{
       
       ChildOfDerived1(){
           System.out.println("I am a child of derived constructor");
       }

       ChildOfDerived1(int x,int y,int z){
           super(x,y);
           System.out.println("I am an overloaded constructor of Derived with value of z as "+z);
       }
}

public class helper{

    public static void main(String[] args){
         
         Base1 b = new Base1();
         Base1 b1 = new Base1(5);

         Derived1 d = new Derived1();
         Derived1 d1 = new Derived1(5,10);

         ChildOfDerived1 cd = new ChildOfDerived1();
         ChildOfDerived1 cd1 = new ChildOfDerived1(5,10,12); 

    }
}
