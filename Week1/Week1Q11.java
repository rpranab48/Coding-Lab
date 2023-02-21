import java.util.*;
public class Week1Q11 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 14;
        int count=6;
        //int b = 28;
        for(int i=1;i<=n;i++){
               
        System.out.print(a+" "+a*2+" ");
            a = a+count;
            count = count +6;
                    
        }
    }
}
