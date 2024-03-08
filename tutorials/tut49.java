import java.util.Scanner;

public class elper{
     
     public static void main(String[] args){
           
           Scanner sc = new Scanner(System.in);

           int a = sc.nextInt();
           int b = sc.nextInt();
           int c = sc.nextInt();

           int val = ((b*b)-(4*a*c))/(2*a);

           System.out.println(val);
     }
}
