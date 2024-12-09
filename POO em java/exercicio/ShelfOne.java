package exercicio;

public class ShelfOne {
  public static void main(String[] args) {
    Shelf shelf1 = new Shelf();
    shelf1.capacity = 2;
    shelf1.amountInUse = 0;
    shelf1.title = "Romance";

    Book bookOne = new Book();
    bookOne.pages = 375;
    bookOne.title = "How I was before you";
    bookOne.gender = "Romance";
    bookOne.status = 'P';

    shelf1.add(bookOne);
    
    
    Book bookTwo = new Book();
    bookTwo.pages = 200;
    bookTwo.title = "Loves";
    bookTwo.gender = "Romance";
    bookTwo.status = 'S';

    shelf1.add(bookTwo);
    shelf1.listBooks();
    

    shelf1.pickUp(bookOne);
    System.out.println(bookTwo.status);
    System.out.println(bookOne.status);

    
  }
}
