public class abstraction {

  //abstract = abstract classes cannot be instantiated, but they can have a subclass
  //           abstract methods are declared without an implementation.
  public static void main(String[] args) {
    //VehicleAbstraction vehicleAbstraction = new VehicleAbstraction();
    CarAbs car = new CarAbs();

    car.go();
  }
}
