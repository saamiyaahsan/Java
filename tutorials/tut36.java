class MyEmployee{
     
     private int id;
     private String name;

     public String getName(){
         return name;
     }

     public void setName(String name){
          this.name = name;
     }

     public int getId(){
         return id;
     }

     public void setId(int id){
         this.id = id;
     }
}

public class help{
     
     public static void main(String[] args){
          
          MyEmployee harry = new MyEmployee();
          harry.setId(100);
          harry.setName("Harry");

          System.out.println(harry.getId());
          System.out.println(harry.getName());
     }
}
