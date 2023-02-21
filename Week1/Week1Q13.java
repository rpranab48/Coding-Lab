import java.util.*;
import java.lang.Math;
public class Week1Q13 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       // int n = sc.nextInt();
        double n = sc.nextDouble(); // number
        int b = 1;
        char c=65;
        //double x;
            for(int i=1;i<n;i++){
            //x=Math.pow(b, i);
            System.out.print((char)c+""+b+" ");
            c++;
            b++;
            if(c>90)
                c=65;
            if(b>26){
                b=1;
            }
            }
    }
}