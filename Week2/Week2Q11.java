import java.util.*;
public class Week2Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd=1,LCM=1;
        for(int i=1;i<=a&&i<=b;i++){
            if(a%i==0 && b%i==0)
            gcd = i;
        }
        System.out.println("GCD of two number is: "+gcd);
        int c = (a*b)/gcd;
        System.out.println("LCM of two number is: "+c);
    }
}
