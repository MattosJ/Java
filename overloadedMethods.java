public class overloadedMethods {
  // overloaded methods = methods chat share same name but have different parameters.
  // method name + parameters = method signature.
  public static void main(String[] args) {
    int x = add(1,2) ;
    int y = add(1,2,3);
    int z = add(1,2,3,4);
    double e = add(1.1,1.2);
    System.out.println(x);
    System.out.println(y);
    System.out.println(z);
    System.out.println(e);
    
  }
  static int add(int a , int b){
    return a + b;
  }
  static int add(int a, int b , int c){
    return a + b + c;
  }
  static int add(int a , int b, int c, int d){
    return a + b + c + d;
  }
  static double add(double a , double b){
    return a + b;
  }
  static double add(double a, double b , double c){
    return a + b + c;
  }
  static double add(double a , double b, double c, double d){
    return a + b + c + d;
  }
}
