package exercicio2;
import java.util.ArrayList;
public class Main {
  public static void main(String[] args) {

    ArrayList<Book> books = new ArrayList<>();
    

    Book theShining = new Book();
    theShining.author = "Stephen King";
    theShining.title = "The Shining";
    theShining.publishingCompany = "Doubleday";
    theShining.numPage = 447;
    theShining.price = 45.00;
    theShining.genre = "Horror";
    theShining.year = 1997;

    Book it = new Book();
    it.author = "Stephen King";
    it.title = "It";
    it.publishingCompany = "Viking";
    it.numPage = 1138;
    it.price = 35.00;
    it.genre = "Horror";
    it.year = 1986;

    Book misery = new Book();
    misery.author = "Stephen King";
    misery.title = "Misery";
    misery.publishingCompany = "Viking Penguin";
    misery.numPage = 338;
    misery.price = 25.00;
    misery.genre = "Horror";
    misery.year = 1987;

    Book petSematary = new Book();
    petSematary.author = "Stephen King";
    petSematary.title = "Pet Sematary";
    petSematary.publishingCompany = "Doubleday";
    petSematary.numPage = 374;
    petSematary.price = 30.00;
    petSematary.genre = "Horror";
    petSematary.year = 1983;

    Book carrie = new Book();
    carrie.author = "Stephen King";
    carrie.title = "Carrie";
    carrie.publishingCompany = "Doubleday";
    carrie.numPage = 199;
    carrie.price = 25.00;
    carrie.genre = "Horror";
    carrie.year = 1974;


    books.add(theShining);
    books.add(it);
    books.add(misery);
    books.add(petSematary);
    books.add(carrie);

    for (Book book : books) {
      book.printInfo();
      System.out.println("");
    }

    Book.modifyPriceForYear(books, 2010);


    for (Book book : books) {
      book.printInfo();
      System.out.println("");
    }

    it.modifyPrice(10);
    it.printInfo();
  }



 
}
