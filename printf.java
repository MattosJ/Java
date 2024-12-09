public class printf {
  //printf() = an optional method to control, format, and display texto to the console windows
    // two arguments = format string + (object/variable/value)
    // % [flags] [precision] [width] [ conversion- character]
  public static void main(String[] args) {
    System.out.printf("%d This is a format string \n",123);


    boolean myBoolean = true;
    char myChar = '@';
    String myString = "Bro";
    int myInt = 50;
    double myDouble = 1000;

    System.out.printf("%b \n", myBoolean);
    System.out.printf("%c \n", myChar);
    System.out.printf("%s \n",myString);
    System.out.printf("%d \n", myInt);
    System.out.printf("you have this much money %.2f \n", myDouble);
    System.out.printf("Hello %10s \n", myString);
    
  }
}
