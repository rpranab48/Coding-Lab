import java.util.*;
import java.lang.Math;
public class Week1Q2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       // int n = sc.nextInt();
        double a = sc.nextDouble(); // number
        double b = sc.nextDouble(); // power
        
        for(int i=0; i<=b; i++)
          System.out.println(Math.pow(a, i));
    }
}