public class helper{
     
     public static void main(String[] args){
          
          char[] str = {'A','B','C','D','E'};
          String s = new String(str);

          System.out.println(s);

          String s1 = "AbcD";
          String s2 = "AbCd";
          System.out.println(s1 == s2);

          String str1 = new String("Sdft");
          String str2 = new String("sDft");

          System.out.println(str1 == str2);

          int a = 5;
          float b = 7.445f;

          System.out.printf("The value of a is %d and the value of b is %f",a,b);
          System.out.println();
          System.out.printf("The value of a is %d and the value of b is %1.2f",a,b);
          
          System.out.println();
          
          String t = "Howrah";
          System.out.printf("%s",t);
     }
}
