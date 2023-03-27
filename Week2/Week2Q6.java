import java.util.*;
public class Week2Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a,c=0;
        while(n!=0){
            a=n%10;
            c=c*10+a;
            n=n/10;
        }
        System.out.println(c);
    }
}
