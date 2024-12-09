package exercicio5;

public class Circle extends Point {
  protected double radius;


  public Circle(){

  }
  protected double getRadius(double radius){
    this.radius = radius;
    return radius;
  }
  public void getCoordenadas(){
    getX(x);
    getY(y);
  }
  public void setRadius(){
    System.out.println("The radius is: "+radius);
  }
  public void area(){
    // to not add a library I just defined a number of decimal places in pi and used.
    double pi = 3.14159265359;
    double area = pi * (radius * radius);
    System.out.println("The area is:"+ area + "The radius is: "+ radius + "  with coordenadas x: "+ x +" Y: " + y);
  }
}
