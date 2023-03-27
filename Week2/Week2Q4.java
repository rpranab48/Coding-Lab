import java.util.*;
public class Week2Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 65;
        int b = 66;
        int c = 65;
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print((char)a+""+(char)b+""+(char)c+" ");
            a++;
            b++;
            c++;
            if(a>90)
            a=65;
            if(b>90)
            b=66;
            if(c>90)
            c=65;
        }
    }
}
