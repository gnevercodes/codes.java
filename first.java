class animals{
    public static void main(String[] args) {
        final dog d// object reference vari // 
         = new dog()   ; 
        d.size = 43; 
        d.age = 3 ; 
        d.name = "tommy"; 
        d.bark() ; 
    }
}

class dog { 
    int size ; 
    int age ; 
    String name ; 
    double d = 34.4; 
    boolean bark = true ; 

    void bark(){
        System.out.println("woof woof");
    } 
    public void play(){
        System.out.println("playing"); 
    }
}