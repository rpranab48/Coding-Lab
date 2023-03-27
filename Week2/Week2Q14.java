import java.util.*;
public class Week2Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int b,c=0,x;

        for(int i=a;i<=n;i++){
            x=i;
           // while(i!=0){
                b=i%10;
                c=c+(b*b*b);
                i=i/10;
                //if(i%10==0)
                //break;
           // }
            //System.out.println(c);
            if(c==x)
            System.out.println(c);
        }
        
    }
}
