import java.util.*;
import java.lang.Math;
public class Week1Q12 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       // int n = sc.nextInt();
        double n = sc.nextDouble(); // number
        int b = 2;
        char c=65;
        double x;
            for(int i=0;i<n;i++){
            x=Math.pow(b, i);
            System.out.print((char)c+""+(int)x+" ");
            c++;
            if(c>91)
            c=65;
            }
    }
}