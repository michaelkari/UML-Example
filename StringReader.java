import java.io.*; 
public class StringReader{
    public static void main(String args[]){
      /*
        String data; 
        int num1=0, num2=0;
        data = "";
        System.out.println("Please enter in a charcter:");
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);
        try{
          data = reader.readLine();        
          num1 = Integer.parseInt( data );
          data = reader.readLine();
          num2 = Integer.parseInt( data );
          System.out.println(num1/num2);
        }
        catch(Exception e){
          System.out.println ("Error: " + e.getMessage ());
          System.out.println ("Error: " + e.toString ());
          num1=0;
          num2=1;
        }
        finally{
          System.out.println(num1/num2);
        }
        */
      try{
        BufferedReader in = new BufferedReader (new FileReader ("data.txt"));
        String str;
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
