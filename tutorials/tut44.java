public class helper{
     
     public static void main(String[] args){
          
          float[] nums = {90.0f,93.0f,92.0f,91.0f,94.0f};

          for(int i=0;i<nums.length;i++){
              System.out.println(nums[i]);
          }

          int [][] m1 = {{1,2,3},
                         {4,5,6}};

          int [][] m2 = {{7,8,9},
                         {10,11,12}};

          int [][] m3 = {{0,0,0},
                         {0,0,0}};

          for(int i=0;i<m1.length;i++) {
               
               for(int j=0;j<m1[0].length;j++){
                    
                    m3[i][j] = m1[i][j] + m2[i][j];
               }
          }                                        

          for(int i=0;i<m1.length;i++){
               
               for(int j=0;j<m1[0].length;j++){
                    
                    System.out.print(m3[i][j]+" ");
               }

               System.out.println();
          }    
     }
}
