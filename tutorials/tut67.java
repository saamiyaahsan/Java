import java.util.Scanner;

public class Assignment{
      
      public static void main(String[] args){
           
           Scanner sc = new Scanner(System.in);

           int num1 = sc.nextInt();
           int num2 = sc.nextInt();
           int num3 = sc.nextInt();
           int num4 = sc.nextInt();
           int num5 = sc.nextInt();

           int total_marks_avg = (num1 + num2 + num3 + num4 + num5)/5;

           System.out.println(total_marks_avg);
      }
}
