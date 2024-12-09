public class inheritance {
  // inheritance = the process where one class acquires, the attributes and methods of another.
  public static void main(String[] args) {
    CarForInheritance car = new CarForInheritance();

    car.go();

    Bicycle bike = new Bicycle();

    bike.stop();

    System.out.println(car.doors);
    System.out.println(bike.pedals);
  }
}
