public class Wheel{
  private String brand; //Creates brand variable
  private String model; //Creates model variable
  private String season; //Creates season variable
  private int size; //Creates size variable
  private int kM_usage; //Creates kM_usage variable
  private String tread_condition; //Creates tread condition variable

  public Wheel(String br, String mod, String sea, int siz){ //Constructs Wheel object
    brand=null;
    model=null;
    season=null;
    size=0;
    kM_usage=0;
    tread_condition=null;
    brand=br; //Assigns value given from parameter to brand variable
    model=mod; //Assigns value given from parameter to model variable
    season=sea; //Assigns value given from parameter to season variable
    size=siz; // Assigns value given from parameter to size variable 
  }
  public void update_KM_usage(int km){
    kM_usage=km;
  }
  public String getBrand(){
    String braa;
    braa=brand;
    return braa;
  }
  public String getModel(){
    String modd;
    modd=model;
    return modd;
  }
  public String getSeason(){
    String seaa;
    seaa=season;
    return seaa;
  }
  public int getSize(){
    int sizz;
    sizz=size;
    return sizz;
  }
  public int getKM(){
    int kmm;
    kmm=kM_usage;
    return kmm;
  }
  public String getTreadCondition(){
    String treadd;
    treadd=tread_condition;
    return treadd;
  }
}