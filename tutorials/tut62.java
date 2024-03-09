public class tut13{

    static int sum(int a,int b){
        return a+b;
    }

    static int sum(int a,int b,int c){
        return a+b+c;
    }

    static int sum(int a,int b,int c,int d){
        return a+b+c+d;
    }

    public static int sum(int ...arr){

        int result = 0;

        for(int ele : arr){
            result += ele;
        }

        return result;
    }

    public static int sum1(int x,int ...arr){

        int result = x;

        for(int ele : arr){
            result += ele;
        }

        return result;
    }

    public static void main(String[] args){
        
        System.out.println("The sum of nothing is: "+ sum());
        System.out.println("The sum of 1 is: " + sum(1));
        System.out.println("The sum of 4 and 5 is: "+ sum(4,5));
        System.out.println("The sum of 4,3 and 5 is: "+ sum(4,3,5));
        System.out.println("The sum of 2,4,3 and 5 is: "+ sum(2,4,3,5));
      //  System.out.println(sum1()); // this won't work
    }
}
