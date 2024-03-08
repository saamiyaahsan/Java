// Rock Paper and Scissor game!!!

import java.util.Random;
import java.util.Scanner;

public class helper{
     
     public static void main(String[] args){
          
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter 0 for rock , 1 for paper and 2 for scissor");

          int userInput = sc.nextInt();
          
          Random rand = new Random();
          int compInput = rand.nextInt(3);

          if(userInput == compInput){
              System.out.println("draw");
          }

          else if(userInput == 0 && compInput == 2 || userInput == 1 && compInput == 0
                || userInput == 2 && compInput == 1){
                System.out.println("You win!");
           }

           else{
               System.out.println("Computer wins!");
           }

           if(compInput == 0){
               System.out.println("Computer choice : Rock");
           }

           else if(compInput == 1){
               System.out.println("Computer choice : Paper");
           }

           else{
                System.out.println("Computer choice : Scissor");
           }

     }
}
