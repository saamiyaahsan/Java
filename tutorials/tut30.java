public class cwh{
     
     int x;

     public int getX(){
         return x;
     }

     cwh(int x){
          this.x = x;
     }

     public static void main(String[] args){
          
          cwh obj1 = new cwh(65);
          System.out.println(obj1.getX());
     }
}
