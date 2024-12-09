public class wrapperClasses {
// wrapper class = provides a way to use primitive data types as reference data types.
// reference data types contain useful methods.
// can be used with collections (ex.ArrayList).
/* Primitive        Wrapper
  boolean           Boolean
  char              Character
  int               Integer
  double            Double

  autoboxing = the aumomatic conversion that the java compiler makes between the primite data types and their correspondiing object wrapper classes.
  unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive 
 */

  public static void main(String[] args) {
    Boolean a = true;
    Character b = '@';
    Integer c = 123;
    Double d = 3.14;
    String e = "James";

    if(a==true){
      System.out.println("This is true");
    }
    if(b=='@'){
      System.out.println("This is true");
    }


  }
}
