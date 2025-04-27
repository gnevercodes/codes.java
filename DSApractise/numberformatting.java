import java.util.*;
import static java.lang.Math.* ; 
public class numberformatting {
    public static void main(String[] args) {
        String S = String.format("%,.2f",456767.098);
        System.out.println(S);

        Date today = new Date() ; 
        String z = String.format("%tc",today);
        System.out.println(z);
    }

}
