public class Pizzaria {
  String bread;
  String sauce;
  String cheese;
  String topping;

  public Pizzaria(String bread, String sauce, String cheese) {
    this.bread = bread;
    this.sauce = sauce;
    this.cheese = cheese;
    
  }
  public Pizzaria(String bread, String sauce) {
    this.bread = bread;
    this.sauce = sauce;
  }
  public Pizzaria(String bread) {
    this.bread = bread;
  }
  public Pizzaria() {
    
  }
  public Pizzaria(String bread, String sauce, String cheese, String topping) {
    this.bread = bread;
    this.sauce = sauce;
    this.cheese = cheese;
    this.topping = topping;
  }
}
