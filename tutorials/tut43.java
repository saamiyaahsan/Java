public class helper{
     
     public static void main(String[] args){
          
          int[] arr = {100,200,300,400,500};

          int ans = Integer.MIN_VALUE;

          for(int i : arr){
               ans = Math.max(ans,i);
          }

          System.out.println(ans);
     }
}
