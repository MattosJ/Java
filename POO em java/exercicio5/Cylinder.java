package exercicio5;

public class Cylinder extends Circle{
  protected double height;
  public Cylinder(){
    
  }
  public double getHeight(double height){
    this.height = height;
    return height;
  }

  public void setHeight(){
    System.out.println("The height is: "+height);
  }

  public void areaSup(double radius){
    getRadius(radius);
    double pi = 3.14159265359;
    double areasupC = 2 * pi * radius * height + 2 * pi;
    System.out.println("The area of sup is: " + areasupC);
  }
  public void volume(){
    double pi = 3.14159265359;
    double volumeCylinder =  pi * (radius * radius) * height;
    System.out.println("The volume of Cylinder is: " + volumeCylinder);
  }
}
