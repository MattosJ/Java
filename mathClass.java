import java.util.Scanner;
public class mathClass {

  public static void main(String[] args) {
    
    double x = 3.14;
    double y = -10;
    double j = 100;
    double r = 3.1;

    double z = Math.max(x, y);
    double p = Math.min(x, y);
    double c = Math.abs(y);
    double d = Math.sqrt(j);
    double rou = Math.round(r);
    double rou2 = Math.ceil(r);
    double ji = Math.floor(r);

    System.out.println(ji);
    System.out.println(rou2);
    System.out.println();
    System.out.println(rou);
    System.out.println(c);
    System.out.println(z);
    System.out.println(p);
    System.out.println(d);


    double a;
    double b;
    double h;


    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter side x: ");
    a = scanner.nextDouble();
    System.out.println("Enter side y: ");
    b = scanner.nextDouble();
    h = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    System.out.println("The hypotenusa is: "+h);
  }
}
