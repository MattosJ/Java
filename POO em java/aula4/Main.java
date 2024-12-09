package aula4;

public class Main {
  public static void main(String[] args) {
    Clock relogio = new Clock(0,0,0);
    relogio.increment();
    relogio.reportTime();
    relogio.increment();
    relogio.reportTime();
    relogio.increment(10);
    relogio.reportTime();
    relogio.increment(48);
    

    relogio.decrement();
    relogio.reportTime();
    relogio.decrement(10);
    relogio.reportTime();
    relogio.decrement(60);
    relogio.reportTime();
    relogio.decrement(61);
    relogio.reportTime();

  }
}
