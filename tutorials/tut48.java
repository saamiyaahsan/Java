import java.util.Scanner;

public class helpe{
     
     public static void main(String[] args){ 

          Scanner sc = new Scanner(System.in);

          int num = sc.nextInt();

          System.out.println(num > 10);
          System.out.println(7*49/7+35/7);

          
          char grade = 'B';
          
          grade = (char)(grade + 8);
          System.out.println(grade);

          grade = (char)(grade - 8);
          System.out.println(grade);

          float x = 7/4.0f;
          float y = 8/3.0f;
          float z = x*y;

          System.out.println(z);
     
          float a = 7/4;
          float b = 8/3;
          float c = a*b;

          System.out.println(c);
     }
}
