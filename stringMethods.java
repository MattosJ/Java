
public class stringMethods {
// String = a reference data type that can store one or more characters.
// reference data types have access to useful methods.
  public static void main(String[] args) {
  String name = "James";
  boolean result = name.equals("Bro");
  if(result == true){
    System.out.println("yes");
  }
  else{
    System.out.println("No");
  }
  int result2 = name.length();
  System.out.println(result2);

  char result3 = name.charAt(0);
  System.out.println(result3);
  
  int result4 = name.indexOf("a");
  System.out.println(result4);

  boolean reuslt5 = name.isEmpty();
  System.out.println(reuslt5);

  String result6 = name.toUpperCase();
  System.out.println(result6);

  String result7 = name.toLowerCase();
  System.out.println(result7);

  String result8 = name.trim();
  System.out.println(result8);

  String result9 = name.replace('a', '4');
  System.out.println(result9);


  }
}
