import java.io.*;


public class deserialization {
    
    public static void main(String[] args) {
        

        try{
            FileInputStream in = new FileInputStream("something.ser"); 
            ObjectInputStream ois = new ObjectInputStream(in) ; 
           

            Object one = ois.readObject() ;
            
            serializationChapter anotherOne   = (serializationChapter)one; 


            
            ois.close() ; 
        }
        catch(Exception e) {
            e.printStackTrae() ; 
        }

    }
}
