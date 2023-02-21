import java.util.*;
public class Week1Q7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 7;
        int b = 10;
        for(int i=0;i<n;i++){
            if(i%2==0){
                System.out.print(a+" ");
                a+=1;
            }else{
                System.out.print(b+" ");
                b+=1;
            }
    }   
}
}
