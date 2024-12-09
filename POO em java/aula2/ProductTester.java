package aula2;

public class ProductTester {
  public static void main(String[] args) {
   // construtor padrão: 
   Product product1 = new Product();
    product1.name = "Black pen";
    product1.marker = "Bic";
    product1.value = 1.50f;
   // construtor de dois parâmetros:
   Product product2 = new Product("Milk","No Marker");
    product2.value = 4.20f;
   // contrutor de três parâmetros:
   Product product3 = new Product("Rubber","No marker", 2.4f);

   //objeto Product1
   System.out.println("Name: " + product1.name + " Marker: " + product1.marker + " Value: " + product1.value);

   // objeto Product2
   System.out.println("Name: " + product2.name + " Marker: " + product2.marker + " Value: " + product2.value);

   //objeto Product3
   System.out.println("Name: " + product3.name + " Marker: " + product3.marker + " Value: " + product3.value);
  }
}
