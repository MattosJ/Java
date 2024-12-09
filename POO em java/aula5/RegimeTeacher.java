package aula5;

public class RegimeTeacher extends Teacher{
  protected double wage;

  public RegimeTeacher(String name, int age, String matriculation, double wage){
    super(name,age,matriculation);
    if(wage > 0){
      this.wage = wage;
    }
  }

  public double getWage(){
    return wage;
  }
  
}
