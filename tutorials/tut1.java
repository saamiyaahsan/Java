import java.util.Scanner; 

public class test{
     
     public static void paintBuildings(int N,int M,int X,int Y,int[] array){
           
           int totalpaintreq = 0;

           for(int i=0;i<N;i++){
               totalpaintreq = totalpaintreq + array[i];
           }

           int bucketsRequired = (int) Math.ceil((double)totalpaintreq/X);

           int addBuckets = bucketsRequired - M;

           if(addBuckets <= 0){
               addBuckets = 0;
           }

           int cost = addBuckets*Y;

           System.out.println(addBuckets+" "+cost);
     }

     public static void main(String[] args){
           
           Scanner sc = new Scanner(System.in);

           int N,M,X,Y = sc.nextLine().split(" ");

           int[] array = new int[N];

           for(int i=0;i<N;i++){
                int c = sc.nextLine().split(" ");
                array[i] = c;
           }

           paintBuildings(N,M,X,Y,array);
     }
}
