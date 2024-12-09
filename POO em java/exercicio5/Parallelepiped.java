package exercicio5;

public class Parallelepiped extends Square{
  protected double length;
  protected double height;
  
  public Parallelepiped(double length, double side,double height){
    super(side);
    this.length = length;
    this.height = height;
  }
  
  public void volumeParallelepipded(){
    System.out.println("The volume of parallelepipeded is: "+length * height * side);
  }
}
