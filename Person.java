public class Person{
  private String fname; //Creates first name variable
  private String lname; //Creates last name variable
  private String dob; //Creates date of birth variable
  private Double height; //Creates height variable
  private Double weight; //Creates weight variable

  public Person(String first, String last, String dayob, Double h, Double w){ //Constructs person object
    fname=first; //Assigns value given from parameter to fname variable
    lname=last; //Assigns value given from parameter to lname variable
    dob=dayob; //Assigns value given from parameter to date of birth variable
    height=h; // Assigns value given from parameter to height variable 
    weight=w; // Assigns value given from parameter to weight variable
  }
  public void setName(String first, String last){ //Creates method that sets name
    fname=first; //Assigns value given from parameter to fname variable
    lname=last; //Assigns value gien from parameter to lname variable
  }
  public boolean setWeight(Double w){ //Creates method that sets weight
    boolean ex; //Creates boolean
    weight=w; //Assings value given from paramter to weight variable
    ex=true; //Makes boolean true if successful
    return ex; //Returns boolean
  }
  public boolean setHeight(Double h){ //Creates method that sets height
    boolean ex; //Creates boolean
    height=h; //Assings value given from paramter to height variable
    ex=true; //Makes boolean true if successful
    return ex; //Returns boolean
  }
  public String getName(){ //Creates method that retrieves name
    String name; //Creates name variable
    name=fname +" "+lname; //Sets name
    return name; //Returns name
  }
  public String getDOB(){ //Creates method that retrieves date of birth
    String dOb; //Creates date of birth variable
    dOb=dob; //Sets date of birth
    return dOb; //Returns date of birth
  }
  public int getDOB_year(){ //Creates method that retrieves year
    int year; //Creates year variable
    year=Integer.parseInt(dob.substring(6)); //Sets year
    return year; //Returns year
  }
  public int getDOB_month(){ //Creates method that retrieves month
    int month; //Creates month variable
    month=Integer.parseInt(dob.substring(0,2)); //Sets month
    return month; //Returns month 
  }
  public int getDOB_day(){ //Creates method that retrieves day
    int day; //Creates day variable
    day=Integer.parseInt(dob.substring(3,5)); //Sets day
    return day; //Returns day 
  }
  public double getHeight(){ //Creates method that retrieves height
    double hi; //Creates height variable
    hi=height; //Sets height
    return hi; //Returns height 
  }
  public double getWeight(){ //Creates method that retrieves weight
   double we; //Creates weight variable
   we=weight; //Sets weight
   return we; //Returns weihgt 
  }
}