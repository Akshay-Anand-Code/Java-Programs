package Java.src.Generics;

public class Main {
    public static void main(String[] args) {
        String myWord = "Hello";
        Book myBook = new Book("My Book");
        Container <String> wordContainer = new Container<String> (myWord);
         
         Container<Book> bookContainer = new Container<Book> (myBook);
    
         System.out.println(wordContainer.getData());
         System.out.println(bookContainer.getData());
        
        // Create `Container` references and print statement below...
      }
}
