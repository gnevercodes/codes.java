import java.io.FileWriter; 
public class wrapperclass 
{
    public static void main(String[] args) {
       
     try{
        FileWriter fw = new FileWriter("notes.txt") ;
        fw.write("this is a test to check if this works") ; 

        fw.close() ; 
     }
     catch(Exception e) {
        e.printStackTrace();
     }

    }
}