package exercicio2;

import java.util.ArrayList;

public class Book {
    String author;
    String title;
    String publishingCompany;
    int numPage;
    double price;
    String genre; 
    int year;     
    

    public void printInfo( ){
        System.out.println("Author: "+author);
        System.out.println("Title: " + title);
        System.out.println("Publishing Company: "+publishingCompany);
        System.out.println("Num Page: " +numPage);
        System.out.println("Price: "+price+"R$");
        System.out.println("Genre: "+genre);
    }

    public void modifyPrice(double valuePercent){
        if(valuePercent <= 100){
            price = ((price) - (price * (-valuePercent / 100)));
            System.out.println("The value it was modified!");
        }
        else{
            System.out.println("The value is bigger than the price");
        }

    }

    public void year(){
        System.out.println(year);
    }

    public static void modifyPriceForYear(ArrayList<Book> books, int year) {
        for (Book book : books) {
            if (book.year < year) {
                book.modifyPrice( 8);
            } else {
                book.modifyPrice(10);
            }
        }
    }   



    
}

