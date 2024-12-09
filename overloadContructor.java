public class overloadContructor {
  //overload constructor = multiple constructor within a class with the same name, but have different parameters.
  //name + parameters = signature.
  public static void main(String[] args) {
    Pizzaria pizzaria = new Pizzaria("thicc crust");
    System.out.println("Here are the ingredients of you  pizza: ");
    System.out.println(pizzaria.bread);
    System.out.println(pizzaria.sauce);
    System.out.println(pizzaria.cheese);
    System.out.println(pizzaria.topping);
    
  }
  
}
