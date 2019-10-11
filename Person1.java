public class Person1{
  private String fname;
  private String lname;
  private String dOb;
  private double h;
  private double w;
  public Person1(String first, String last){
    fname=first;
    lname=last;
  }
  public Person1(String first, String last, String dob){
    fname=first;
    lname=last;
    dOb=dob;
  }
  public Person1(String first, String last, String dob,double height, double weight){
    fname=first;
    lname=last;
    dOb=dob;
    h=height;
    w=weight;
  }
  public void setName(String first,String last){
    fname=first;
    lname=last;
  }
  public static double convertKgToLbs(double kg){
    return (kg*2.2);
  }
  public boolean setWeight(double we){
    boolean ex;
    w=we;
    ex=true;
    return ex; 
  }
  public static double convertMetersToInches(double m){
    return (m*39.4);
  }
  public boolean setHeight(double hi){
    boolean ex;
    h=hi;
    ex=true;
    return ex; 
  }
  public String getName(){
    String nm;
    nm=fname;
    return nm;
  }
  public String getDOB(){
    String db;
    db=dOb;
    return db;
  }
  public int getDOB(String dobb){
    if(dobb.equals("month")){
      return Integer.parseInt(dOb.substring(0,2));
    }
    else if(dobb.equals("day")){
      return Integer.parseInt(dOb.substring(3,5));
    }
    else if(dobb.equals("year")){
      return Integer.parseInt(dOb.substring(6));
    }
    else{
      return 0;
    }
  }
  public double getHeight(){
    double hi;
    hi=h;
    return hi;
  }
  public double getWeight(){
    double we;
    we=w;
    return we;
  }
  public String toString(){
    return "The Student object name is ="+fname;
  }
}