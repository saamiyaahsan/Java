public class tut9{
    public static void main(String[] args){

        int [] marks = {98,100,97,99,92};

        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }

        for(int i=marks.length-1;i>=0;i--){
            System.out.println(marks[i]);
        }

        for(int element : marks){
            System.out.println(element);
        }
    }
}
