public class helper{
     
     public static void main(String[] args){
           
           String name = "Parker";
           name = name.toLowerCase();
           System.out.println(name);

           String txt = "To the new   beginnings";
           txt = txt.replace(' ','_');
           System.out.println(txt);
     
           String someContent = "Dear <name> , thanks a lot";
           someContent = someContent.replace("<name>","Deer");
           System.out.println(someContent);
     }
}
