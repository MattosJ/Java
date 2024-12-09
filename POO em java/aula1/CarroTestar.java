package aula1;

public class CarroTestar {
  public static void main(String[] args) {
    Carro car1 = new Carro();

    car1.name = "Uno";
    car1.mark = "Fiat";
    car1.year = 2015;
    car1.speed = 60;

    car1.acelerate(10);
    
    System.out.println("Speed: " + car1.speed + " Km/h");

    car1.breaker(20);
    
    System.out.println("Speed: " + car1.speed + " Km/h");
  }

}
