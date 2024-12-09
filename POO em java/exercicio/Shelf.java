package exercicio;

import java.util.ArrayList;

public class Shelf {
  public int capacity;
  public String title;
  public int amountInUse;
  private ArrayList<Book> books;

  public Shelf() {
    books = new ArrayList<>();
  }

  public void  add(Book book){
    if((capacity > amountInUse) && ( amountInUse + 1 <= capacity)){
      books.add(book);
      book.saveInShelf();
      amountInUse ++;
      System.out.println("You added the book to shelf");
    }
    else{
      System.out.println("The capacity in not suficient");
    }
  }

  public void pickUp(Book book){
    if(books.contains(book)){
      books.remove(book);
      amountInUse --;
      book.pickUpInShelf();
      System.out.println("You pick up the book");
    }
    else{
      System.out.println("Not have the amount of the book");
    }
  }

  public void listBooks(){
    System.out.println("Books on the shelf:");
    for(Book book : books){
      System.out.println(book.title);
    }
  }
}
