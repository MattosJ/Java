package aula5;

public class HourlyTeacher extends Teacher {
  private double valueOfHours;
  private int amountHours;
  private double wage;
  
  public HourlyTeacher(String name, int age, String matriculation, int amountHours, double valueOfHours){
    super(name, age, matriculation);
    if(amountHours > 0){
      this.amountHours = amountHours;
    }
    if(valueOfHours > 0){
      this.valueOfHours = valueOfHours;
    }
  }

  public double returnWage(){
    wage = valueOfHours * amountHours;
    return wage;
  }
}