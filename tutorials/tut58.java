public class tut8{

    public static void main(String[] args){

        for(int i=10;i>=0;i--){

            if(i == 7){
                break;
            }

            System.out.println(i);
        }

        for(int i=7;i>=0;i--){

            if(i == 3){
                continue;
            }
            System.out.println(i);
        }
    }
}
