import java.util.*;
public class Week2Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a,b=0;
        if(n!=1 && n!=0){
        for(int i=1;i<=n;i++){
            if(n%i==n || n%i==0)
            b++;
        }
        if(b==2)
        System.out.println("prime");
        else
        System.out.println("not prime");
       
    }
        if(n==1)
            System.out.println(n);
        if(n==0)
            System.out.println(n);
    }
}
