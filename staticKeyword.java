public class staticKeyword {
  // static = modifier. A single copy of a variable/ method  is created and shared.
      //the class "owns" the static member.
  public static void main(String[] args) {
    Friend friend1 = new Friend("Sponegbob");
    Friend friend2 = new Friend("James");
    Friend friend3 = new Friend("Pedro");
    Friend friend4 = new Friend("Ana");
    
    Friend.displayFriends();
  }
}
