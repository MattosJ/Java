public class copyObjects {
  public static void main(String[] args) {
    carE car1 = new carE("Chevrolet","Camaro",2021);
    //carE car2 = new carE("Ford","Mustang",2022);

    //car2.copy(car1);

    carE car2 = new carE(car1);
    System.out.println(car1);
    System.out.println(car2);
    System.out.println();

    System.out.println(car1.getMake());
    System.out.println(car1.getmodel());
    System.out.println(car1.getyear());
    System.out.println();
    System.out.println(car2.getMake());
    System.out.println(car2.getmodel());
    System.out.println(car2.getyear());




  }
}
