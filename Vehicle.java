public class Vehicle{
  private String type;
  private String manufacturer;
  private String model;
  private short year;
  private String colour;
  private byte numOfDoors; 
  private float gasTankSize; 
  private float gas; 
  private int km; 

  public Course(String typ, String manu, String mod, short yea, String col, byte nDoors, float tankS){
    type=typ;
    manufacturer=manu;
    model=mod;
    year=yea;  
    colour=col;
    numOfDoors=nDoors;
    gasTankSize=tankS;
    gas=0.0f;
    km=0;
  }
  public void paint(String colourr){
    colour=colourr;
  }
  public void gasUp(int litres){
    gas+=(float)litres;
  }
  public Boolean drive(int distance){
    boolean ex;
    km+=distance;
    ex=true;
    return ex;
  }
  public String getType(){
    String typee;
    typee=type;
    return typee;
  }

  
}