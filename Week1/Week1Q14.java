import java.util.*;
import java.lang.Math;
public class Week1Q14 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       // int n = sc.nextInt();
        double n = sc.nextDouble(); // number
        int b = 1;
        int c=65;
        int d = 90;
        //double x;
            for(int i=1;i<n;i++){
                System.out.print((char)c+" ");
                for(int j = i+1;j<=i+2;j++){
                    System.out.print((char)d+" ");
                    d=d-2;
                }
                c++;
                i=i+3;
            
            }
    }
}