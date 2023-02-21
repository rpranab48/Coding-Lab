import java.util.*;
import java.lang.Math;
public class Week1Q5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       // int n = sc.nextInt();
        double a = sc.nextDouble(), c; // number
        int b = 2;
        
        for(int i=0; i<=a; i++){
          c=Math.pow(i, b);
          System.out.print((int)c + " ");
        }
    }
}