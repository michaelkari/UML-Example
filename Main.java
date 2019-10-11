import java.io.*; 
public class Main{
  public static void main(String[] args){
    String firstName;
    String lastName;
    double mathMark;
    double englishMark;
    double computerMark;
    int studentNum;
    int numberOfStudents=-1;
    int counter=0;
    try{
      FileInputStream fs = new FileInputStream("studentdata.txt");
      DataInputStream in = new DataInputStream(fs);
      BufferedReader br = new BufferedReader(new InputStreamReader(in));
      BufferedReader br1 = new BufferedReader(new InputStreamReader(in));
      String sLine,sLine1;
      while ((sLine = br.readLine()) != null)   {
        numberOfStudents+=1;
      }
      Student[] student=new Student[numberOfStudents];
      br1.readLine();
      while ((sLine1 = br1.readLine()) != null)   {
        String[] part = sLine1.split(" ");
        if(part[1].equals("-")){
          student[counter] = new Student(Integer.parseInt(part[0]));
        }
        else if(part[3].equals("-")){
          student[counter] = new Student(Integer.parseInt(part[0]),part[1],part[2]);
        }
        else{
          student[counter] = new Student(Integer.parseInt(part[0]),part[1],part[2],Double.parseDouble(part[3]),Double.parseDouble(part[4]),Double.parseDouble(part[5]));
        }
        System.out.println(student[counter]);
        counter+=1;
      }
    }
    catch(Exception e){
      System.out.println ("Error: " + e.getMessage ());
      System.out.println ("Error: " + e.toString ());
    }
    finally{
    
    }
  }
}