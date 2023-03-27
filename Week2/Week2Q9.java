import java.util.*;
public class Week2Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int b=0,sum=0,j,i;
        for(j=2;j<=x;j++){
            
            for(i=1;i<=j;i++){
                if(j%i==0)
                    b=b+1;
            }
            if(b==2)// b=2
                sum = sum +j;
                b=0;
       //System.out.println(sum);
        }
    System.out.println(sum);
    }
}
