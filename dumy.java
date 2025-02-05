public class dumy {
    public static void main(String[] args) {
        dumy2[] objects1  = new dumy2[10];
        objects1[0] = new dumy2();
        objects1[0].setName("hello");  
        objects1[0].notmain();


        
    }
}
class dumy2 {
    private String name ;  
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void notmain()
    {
        System.out.println("hello");
    }
}