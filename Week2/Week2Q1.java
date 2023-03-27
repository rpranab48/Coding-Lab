import java.util.*;
public class Week2Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum=0,n;
        while(a!=0){
            n = a%10;
            sum = n + sum;
            a = a/10;
        }
        System.out.println(sum);
        
    }
}
