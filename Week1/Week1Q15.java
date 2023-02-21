import java.util.*;
public class Week1Q15 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       // int n = sc.nextInt();
        double n = sc.nextDouble(); // number
        int b = 1;
        char c=65;
        char d = 66;
        char e = 67;
        //double x;
        for(int i = 0;i<n;i++){
            System.out.print((char)d+""+(char)e+""+(char)c+""+b+" ");
            b++;
            c++;
            if(c>90)
            c=65;
            if(b>26)
            b=1;
        }
    }
}