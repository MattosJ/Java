package aula2;

public class Product {
  // atributos
  String name;
  String marker;
  float value;

  // construtores

  Product(){

  }

  Product(String name){
    this.name = name; 
  }

  Product(String name, String marker){
    this.name = name;
    this.marker = marker;
  }

  Product(String name, String marker, Float value){
    this.name = name;
    this.marker = marker;
    this.value = value;
  }

}

