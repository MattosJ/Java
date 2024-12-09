package exercicio5;

public class Point {
  protected double x;
  protected double y;

  public  Point( ){
  }
  protected double getX( double x){
    this.x = x;
    return x;
  }
  protected double getY(double y){
    this.y = y;
    return y;
  }
  public void setPoint(){
    System.out.println("The point with value in x:"+x+" And value in y: " + y);
  }


}


  