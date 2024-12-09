public class arrays {
  // array = used to store multiple values in a single variable.
  public static void main(String[] args) {
    String[] cars = new String[3];
    cars[0] = "Camaro";
    cars[1] = "Coverte";
    cars[2] = "Tesla";

    for(int i = 0; i < cars.length; i++){
      System.out.println(cars[i]);
    }
  }
}
