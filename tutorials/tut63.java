import java.util.Scanner;

public class Recursion{

    static int factorial(int n){
         
         if(n == 1 || n == 0){
             return 1;
         }

         return n*factorial(n-1);
    }

    public static void main(String[] args){
         
         Scanner sc = new Scanner(System.in);
         
         int num = sc.nextInt();

         int ans = factorial(num);

         System.out.println("The factorial of "+ num +" is "+ans); 
    }
}
