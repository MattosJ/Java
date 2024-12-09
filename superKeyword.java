public class superKeyword {
  // super = keyword refers to the superClass (parent) of an object
  // very similar to the "this" keyword.
  public static void main(String[] args) {
    Hero hero1 = new Hero("Batman",42,"$$$");
    Hero hero2 = new Hero("Superman",43,"everything");
    System.out.println(hero2.toString());
    System.out.println(hero1.toString());
  }
}
