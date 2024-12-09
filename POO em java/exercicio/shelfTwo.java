package exercicio;

public class shelfTwo {
  public static void main(String[] args) {
    Shelf shelfTwo = new Shelf();
    shelfTwo.capacity = 100;
    shelfTwo.amountInUse = 0;
    shelfTwo.title = "Horror";


    Book HorrorBook = new Book();
    HorrorBook.pages = 200;
    HorrorBook.gender = "Horror";
    HorrorBook.status = 'S';
    HorrorBook.title = "American Horror Story";

    Book theBlackCat = new Book();
    theBlackCat.pages = 100;
    theBlackCat.gender = "Horror";
    theBlackCat.title = "THe black cat";
    theBlackCat.status = 'S';

    shelfTwo.add(HorrorBook);
    shelfTwo.add(theBlackCat);
    shelfTwo.listBooks();
  }
}
