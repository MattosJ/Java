public class objectPassing {
  public static void main(String[] args) {

    Garage garage = new Garage();

    car3 car = new car3("BMW");
    car3 car2 = new car3("Tesla");
    garage.park(car);
    garage.park(car2);
  }
}
