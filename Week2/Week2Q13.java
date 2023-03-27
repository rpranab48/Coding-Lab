import java.util.*;
public class Week2Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b,c=0,d=a;
        while(a!=0){
            b=a%10;
            c=c+(b*b*b);
            a=a/10;
            //d=c;
        }
        
        System.out.println(c);
        if(c==d){
            System.out.println("Armstrong");
        }else{
            System.out.println("not Armstrong");
        }
    }
}
