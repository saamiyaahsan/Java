
class Library{
     
     String[] books;
     int no_of_books;
     
     Library(){
         this.books = new String[100];
         this.no_of_books = 0;
     }

     void addBook(String Book){
          
          this.books[no_of_books] = Book;
          no_of_books++;
          System.out.println(Book+" has been added! ");
     }

     void showAvailableBooks(){
         System.out.println("Available books are!");

         for(String book : books){
             
             if(book == null){
                 continue;
             }
             System.out.println("* "+ book);
         }
     }

     void issueBook(String book){

          for(int i=0;i<this.books.length;i++){
              
              if(this.books[i].equals(book)){
                   System.out.println("The book has been issued!");
                   this.books[i] = null;
                   return;
              }
          }

          System.out.println("The book doesn't exist");
     }

     void returnBook(String book){
         addBook(book);
     }
}

public class helper{
     
     public static void main(String[] args){
          
          Library centralLibrary = new Library();
          centralLibrary.addBook("M Gopal");
          centralLibrary.addBook("BK Das");
          centralLibrary.addBook("Leo");
          centralLibrary.showAvailableBooks();

          centralLibrary.issueBook("Leo");
          centralLibrary.showAvailableBooks();

          centralLibrary.returnBook("Leo");
          centralLibrary.showAvailableBooks();
     }
}
