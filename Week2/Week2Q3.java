import java.util.*;
public class Week2Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 65;
        int b = 77;
        int c = 77;
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print((char)a+""+(char)b+""+(char)c+" ");
            a=a+2;
            b=b+2;
            c=c+2;
            if(a>90)
            a=65;
            if(b>90)
            b=77;
            if(c>90)
            c=77;
        }
    }
}
