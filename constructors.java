public class constructors {
  // constructor = special method that is called when an object is instantiated (created)
  public static void main(String[] args) {
    Human human = new Human("James",21,70);
    Human human2 = new Human("Bro", 65, 50);
    System.out.println(human.name);
    System.out.println(human.age);
    System.out.println(human.weight);
    System.out.println(human2.name);
    System.out.println(human2.age);
    System.out.println(human2.weight);
    human2.eat();
    human.drink();
  }
}
