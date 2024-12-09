public class carE {
  private String make;
  private String model;
  private int year;

  carE(String make, String model, int year){
    this.make = make;
    this.model = model;
    this.year = year;
  }
  carE(carE x){
    this.copy(x);
  }
  public String getMake(){
    return make;
  }
  public String getmodel(){
    return model;
  }
  public int getyear(){
    return year;
  }
  public void setmake(String make){
    this.make = make;
  }
  public void setmodel(String model){
    this.model = model;
  }
  public void setyear(int year){
    this.year = year;
  }
  public void copy(carE x){
    this.setmake(x.getMake());
    this.setmodel(x.getmodel());
    this.setyear(x.getyear());
  }
}
