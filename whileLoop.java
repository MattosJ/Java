import java.util.Scanner;

public class whileLoop {
  // while loop = executes a block of code as longa as a it´s condition remains true
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String name = "";

    do{
      System.out.print("Enter your name: ");
      name = scanner.nextLine();
    }while (name.isBlank());
     
    
    System.out.println("Hello " +name);
  }

}
