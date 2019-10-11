import java.io.*; 
public class Question4{
  private int stuNum;
  private String fname;
  private String lname;
  private double mathMk;
  private double engMk;
  private double compMk;
  public static void main(String args[]){
    //Scanner sc=new Scanner(System.in);
    try{
      BufferedReader in = new BufferedReader (new FileReader ("s_data.txt"));
      String str;
      System.out.println("Enter (a)Display all info \n(b)Display all Student Numbers(Only)((c)d)");
      while ((str = in.readLine ()) != null)
      {
        System.out.println (str);
      }
      in.close ();
    }
    catch(Exception e){
      System.out.println ("Error: " + e.getMessage ());
      System.out.println ("Error: " + e.toString ());
    } 
  }
}
