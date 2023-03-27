import java.util.*;
public class Week2Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        int a,b=0;
        for(int i=s;i<=e;i++){
            for(int j=1;j<=i;j++){
                if(i%j==0 || i%j==i)
                b++;
            }
            if(b==2)
            System.out.print(i+" ");
            b=0;
        } 
    }
}
