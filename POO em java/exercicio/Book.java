package exercicio;

public class Book {
  public int pages;
  public String title;
  public String gender;
  public char status;


  void saveInShelf(){
    status = 'S';
  }

  void pickUpInShelf(){
    status = 'P';
  }
}
