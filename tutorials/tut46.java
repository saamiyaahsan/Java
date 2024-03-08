public class help{
     
     public static void main(String[] args){
          
          String str = "Saamiya";

          int len = str.length();

          System.out.println("The length of the string is "+len);
          System.out.println("The string in uppercase is "+str.toUpperCase());
          System.out.println("The string in lowercase is "+str.toLowerCase());

          String str1 = " hello ";
          System.out.println(str1.trim());

          System.out.println("The substring from index 1 is "+str.substring(1));

          System.out.println("The substring from index 1 to 3 is "+str.substring(1,3));
     }
}
