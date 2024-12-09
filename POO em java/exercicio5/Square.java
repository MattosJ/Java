package exercicio5;

public class Square extends Point{
  protected double side;
  public Square(double side){
    this.side = side;
  }
  public void Coordinates(){
    getX(x);
    getY(y);
  }
  public void AreaSupSquare(){
    System.out.println("The area of Square Sup is: " + side * side);
  }
  public void Perimeter(){
    System.out.println("The perimeter of square is: " + side * 4);
  }
}
