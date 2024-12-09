package exercicio5;

public class Cube extends Square{
  
  public Cube(double side){
    super(side);
    this.side = side;
  }
  public void areaSupCube(){
    System.out.println("The area sup Cube is: " + side * side);
  }
  private double CubeSide(){
    return side * side * side;
  }
  public void volumeCube(){
    System.out.println("The volume of cube is: " + CubeSide());
  }
}
