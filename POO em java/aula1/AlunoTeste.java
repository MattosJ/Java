package aula1;

public class AlunoTeste {
  public static void main(String[] args) {
    Aluno student1 = new Aluno();

    //declarando valores aos atributos
    student1.name = "Anne Louise";
    student1.age = 21;
    student1.course = "Business";

    // chamando o os métodos:

    student1.wacthClass();
    student1.makeaTest();
    student1.calculateAverage();

  }
}
