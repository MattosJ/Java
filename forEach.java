import java.util.ArrayList;
public class forEach {
  // for-each = traversing technique to iterate through the elements in an array / collection 
  // less steps, more reabable.
  // less flexible.
  public static void main(String[] args) {
    ArrayList<String> animals = new ArrayList <String>();
    animals.add("Cat");
    animals.add("Dog");
    animals.add("Rat");
    animals.add("Bird");

    for(String i : animals){
      System.out.println(i);
    }
    

  }
}
