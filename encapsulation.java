public class encapsulation {

  // Encapsulation = attributes of a class will be hidden or private,
  //                  can be acessed only through methods (getters & setters)
  //                  You should make attributes private if you don´t have a reason to make them public/protect.
  public static void main(String[] args) {
    carE car = new carE("Chevrolet", "Camaro", 2021);;
    System.out.println(car.getmodel());
    System.out.println(car.getMake());
    System.out.println(car.getyear());

    car.setyear(2022);
    System.out.println(car.getyear());
  }
}
