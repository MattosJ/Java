public class variables {
  // Variable a placeholder for a value that behaves as the value it contains.
    // data type:
    // boolean 1 bit.  primitive value : true or false
    // byte 1 byte.    primitive value : -128 to 127.
    // short 2 bytes.  primitive value : -32,768 to 32,767.
    // int 4 bytes.    primitive value : -2 billion to 2 billion.
    // long 8 bytes.   primite value : -9 quintillion to 9 quintillion.

    // float 4 bytes.  primitive value : fractional number up to 6-7 digits.
    // double 8 bytes.   primitive value : fractional number up to 15 digits.
    
    // char 2 bytes.  primitive value: single character/letter/ ASCII value ex : 'f'.
    // string varies. reference value : a sequence of characters.

    // primite vs reference
    // 8 types      unlimited
    // stores data    stores an address
    // can only hold 1 value  coul hold more than 1 value
    // less memory    more memory
    // fast           slower
  public static void main(String[] args) {
    int x = 123;
    long y = 12345678910L;
    float z = 3.14f;
    double pi = 3.1415;
    boolean t = true;
    char symbol = '%';
    String  name = "James";
    System.out.println(x);
    System.out.println("My number is: " + x);
    System.out.println(y);
    System.out.println(z);
    System.out.println(t);
    System.out.println(pi);
    System.out.println(symbol);
    System.out.println(name);
    System.out.println("Hello, " +name);

     
  }
}
