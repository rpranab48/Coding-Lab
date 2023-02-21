import java.util.*;
public class Week1Q10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 9;
        int b = 21;
        for(int i=1;i<=n;i++){
                if(i%2==0){
                    System.out.print(a+" ");
                    a+=2;
                }else{
                    System.out.print(b+" ");
                }
        } 
        
    }
}
