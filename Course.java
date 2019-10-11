public class Course{
  private String code;
  private String name;
  private String level;
  private float mark;
  private String status;
  private byte lates; 
  private byte absences; 

  public Course(String c, String n, String lev){
    code=null;
    name=null;
    level=null;
    mark=0;
    status=null;
    lates=0;
    absences=0;
    code=c;
    name=n; 
    level=lev; 
  }
  public String getMarkG(){
    String markgg=null;
    if(mark<50.0){
      markgg="Fail";
    }
    else if(mark<60){
      markgg="D";
    }
    else if(mark<70){
      markgg="C";
    }
    else if(mark<80){
      markgg="B";
    }
    else if(mark<90){
      markgg="A";
    }
    else if(mark<=100){
      markgg="A";
    }
    return markgg;
  }
  public float getMark(){
    float markk;
    markk=mark;
    return markk;
  }
  public String getStatus(){
    String statt;
    statt=status;
    return statt;
  }
  public String getLevel(){
    String levv;
    levv=level;
    return levv;
  }
  public String getCode(){
    String codee;
    codee=code;
    return codee;
  }
  public String getName(){
    String namee;
    namee=name;
    return namee;
  }
  public byte getLates(){
    byte latee;
    latee=lates;
    return latee;
  }
  public byte getAbsences(){
    byte abss;
    abss=absences;
    return abss;
  }
  public void addLates(byte num){
    lates+=num;
  }
  public void addAbsences(byte num){
    absences+=num;
  }
  public boolean setMark(float m){
    boolean ex;
    mark=m;
    ex=true;
    return ex;
  }
  public boolean setStatus(String s){
    boolean ex;
    status=s;
    ex=true;
    return ex;
  }
  
}