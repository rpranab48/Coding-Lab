import java.util.*;
public class Week1Q9 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        int b = 1;
        /*for(int i=0;i<=n;i++){
                if(i%2==0){
                    System.out.print(a+" ");
                    a+=4;
                }else{
                    System.out.print(b+" ");
                    b+=4;
                }
        }   */
        for(int i=1;i<n;i+=4){
            a=a+4;
            b=b+4;
            System.out.print(a+" ");
            System.out.print(b+" ");
           
        }
    }
}
