import java.util.ArrayList;
public class ArrayLis{
  // arrayList = a resizable array.
  // Elements can be added and removed after compilation phase.
  // store reference data types.
  public static void main(String[] args) {
    ArrayList<String> food = new ArrayList<String>();

    food.add("Pizza");
    food.add("Hamburger");
    food.add("Hotdog");

    food.set(0, "Sushi");

    food.remove(2);
    //food.clear()


    for(int i = 0 ; i < food.size();i++){
      System.out.println(food.get(i));
    }


  }
}
