public class recap {
    public static void main(String[] arguments) {
         // primitive types are int float        
        System.out.println("hello");
        anotherrecap one = new anotherrecap("s"); 
    }
}
class anotherrecap
{
    public anotherrecap()
    {
        System.out.println("nothing");
    }
    public anotherrecap(String name){
        System.out.println("name is ");
    }
}