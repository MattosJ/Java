package aula5;

public class Teacher {
  private String name;
  private int age;
  private String matriculation;


  public Teacher(String name,int age,String matriculation){
    this.name = name;
    this.age = age;
    this.matriculation = matriculation;
  }

  public String returnName(){
    return name;
  }

  public String returnMatriculation(){
    return matriculation;
  }

  public int returnAge(){
    return age;
  }
  
}
