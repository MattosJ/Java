package aula4;

public class Clock {
  private int hours, minutes ,seconds;

  public Clock(int hours, int minutes, int seconds) {
    this.hours = hours;
    this.minutes = minutes;
    this.seconds = seconds;
    
  }
  public Clock(int hours){
    this.hours = hours;
  }
  public Clock(int hours, int minutes){
    this.hours = hours;
    this.minutes = minutes;
  }

  public void reportTime(){
    System.out.println("Actual hours: " + hours +  " Hours " + minutes +  " Minutes " + seconds + " Seconds");
  }
  public void increment(){
    ++seconds;
    if(seconds > 59){
      seconds = 0;
      minutes ++;
    }
    if(minutes > 59){
      minutes = 0;
      hours ++;
    }
    if(hours > 24){
      hours = 0;
    }
  }
  public void increment(int incrementSeconds){
    if(incrementSeconds > 60){
      incrementSeconds = 0;
    }
    seconds += incrementSeconds;
    if(seconds > 59){
      seconds = seconds - 60;
      minutes ++;
    }
    if(minutes > 59){
      minutes = 0;
      hours ++;
    }
    if(hours > 24){
      hours = 0;
    }
  }

  public void passSecond(int amount){
    for(int i = 0; i < amount; i++){
      increment();
    }
  }

  public void decrement(){
    --seconds;
    if(seconds < 0){
      seconds = 59;
      minutes --;
    }
    if(minutes < 0){
      minutes = 59;
      hours --;
    }
    if(hours < 0){
      hours = 23;
    }
  }

  public void decrement(int decrementSeconds){
    if(decrementSeconds > 60){
      decrementSeconds = 0;
    }
    seconds -= decrementSeconds;
  
    if(seconds < 0){
      seconds = seconds + 60;
      minutes --;
    }
    if(minutes < 0){
      minutes = 59;
      hours --;
    }
    if(hours < 0){
      hours = 23;
    }
  }
}

