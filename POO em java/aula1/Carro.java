package aula1;

public class Carro {
  // atributos

  String name;
  String mark;
  int year;
  float speed;

  // métodos

  void acelerate(int acelerate){
    speed += acelerate;
  }
   
  void breaker(int reduce){
    speed -= reduce;
  }

  void honk(){
    System.out.println("BIIIIIIIIIIIIIIIIIIIIIIII");
  }
  
}