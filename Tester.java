public class Tester{
  public static void main(String[] args){
    Person p1 = new Person("Michael","Karimizadeh","08/29/1999",69.0,150.0);
    Person p2 = new Person("Oliver","Mo","03/12/1999",50.0,100.0);
    
    System.out.println(p1.getName());
    System.out.println(p1.getDOB()); 
    System.out.println(p1.getDOB_year());
    System.out.println(p1.getDOB_month());
    System.out.println(p1.getDOB_day()); 
    System.out.println(p1.getHeight());
    System.out.println(p1.getWeight());
    p1.setName("Grace","Lei");
    p1.setHeight(90.0);
    p1.setWeight(160.0);
    System.out.println(p1.getName());
    System.out.println(p1.getHeight());
    System.out.println(p1.getWeight());
    
    System.out.println("\n"+p2.getName());
    System.out.println(p2.getDOB()); 
    System.out.println(p2.getDOB_year());
    System.out.println(p2.getDOB_month());
    System.out.println(p2.getDOB_day()); 
    System.out.println(p2.getHeight());
    System.out.println(p2.getWeight());
    p2.setName("Salmaan","Khan");
    p2.setHeight(80.0);
    p2.setWeight(140.0);
    System.out.println(p2.getName());
    System.out.println(p2.getHeight());
    System.out.println(p2.getWeight());
    
    Wheel w1= new Wheel("Michilen","Deep Tread","Winter",2);
    Wheel w2= new Wheel("FireStone","Monster Truck","Summer",1);
    
    System.out.println("\n"+w1.getBrand());
    System.out.println(w1.getModel()); 
    System.out.println(w1.getSeason());
    System.out.println(w1.getSize());
    System.out.println(w1.getKM()); 
    System.out.println(w1.getTreadCondition());
    w1.update_KM_usage(100);
    System.out.println(w1.getKM());
    
    System.out.println("\n"+w2.getBrand());
    System.out.println(w2.getModel()); 
    System.out.println(w2.getSeason());
    System.out.println(w2.getSize());
    System.out.println(w2.getKM()); 
    System.out.println(w2.getTreadCondition());
    w2.update_KM_usage(200);
    System.out.println(w2.getKM());
    
    Course c1=new Course("ICS","Computer Science","Grade 12");
    Course c2=new Course("SPH","Physics","Grade 12");
    
    c1.setMark(76.5f);
    c1.setStatus("Enrolled");
    c1.addLates((byte)3);
    c1.addAbsences((byte)2);
    System.out.println("\n"+c1.getAbsences());
    System.out.println(c1.getLates()); 
    System.out.println(c1.getName());
    System.out.println(c1.getCode());
    System.out.println(c1.getLevel()); 
    System.out.println(c1.getStatus());
    System.out.println(c1.getMark());
    System.out.println(c1.getMarkG());

    c2.setMark(92.5f);
    c2.setStatus("Failed");
    c2.addLates((byte)0);
    c2.addAbsences((byte)6);
    System.out.println("\n"+c2.getAbsences());
    System.out.println(c2.getLates()); 
    System.out.println(c2.getName());
    System.out.println(c2.getCode());
    System.out.println(c2.getLevel()); 
    System.out.println(c2.getStatus());
    System.out.println(c2.getMark());
    System.out.println(c2.getMarkG());
    
    Person1 pp1=new Person1("Oliver","MO","06/06/1999",69.0,100.0);
    
    pp1.setName("Grace","Lei"); 
    pp1.setWeight(250);
    pp1.setHeight(60);
    System.out.println("\n"+pp1.getName());
    System.out.println(pp1.convertKgToLbs(250));
    System.out.println(pp1.getDOB());
    System.out.println(pp1.getDOB("month")); 
    System.out.println(pp1.getHeight());
    System.out.println(pp1.getWeight());
    System.out.println(pp1.toString());
  }
}