package aula3;

public class Aluno {
  private String name;
  private int age;

  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return name;
  }

  public void setAge(int age){
    if(age > 0 && age < 150){
      this.age = age;
      System.out.println("The age are seted!");
    }
    else{
      System.out.println("Erro! age invalid!");
    }
    
  }
}
