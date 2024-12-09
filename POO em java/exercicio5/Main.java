package exercicio5;

public class Main  {
  public static void main(String[] args) {

    // para pedimos ao usuário digitasr e usamos os valores digitados pelo usuário fariamos da seguinte forma:
    // importaria a biblioteca import java.util.Scanner; em seguida , Scanner scanner = new Scanner(System.in); declararia o objeto;
    // supondo que eu quero dar a coordenada x do ponto eu iria fazer da forma ,  System.out.print("Enter x coordinate:  "); cPontox = scanner.nextLine(); e após isso usaria no getx(cPontox); e assim sucessivamente para os outros.
    


    Point ponto = new Point();
    ponto.getX(10);
    ponto.getY(20);
    ponto.setPoint();
    Circle circul = new Circle();
    circul.getRadius(10);
    circul.getX(10);
    circul.getY(8);
    circul.area();

    Cylinder cylindri = new Cylinder();
    cylindri.getHeight(10);
    cylindri.areaSup(10);
    cylindri.volume();

    Square square = new Square(10);
    square.AreaSupSquare();
    square.Perimeter();

    Cube cube = new Cube(10);
    cube.areaSupCube();
    cube.volumeCube();

    Parallelepiped parallelepiped = new Parallelepiped(10, 3, 5);
    parallelepiped.volumeParallelepipded();
  }
}
