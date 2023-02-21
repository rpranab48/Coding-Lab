import java.util.*;
public class Week1Q1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        int b = 2;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=2;i<n;i++){
        int  temp = a*b;
        System.out.print(temp+" ");
        //int swap = temp;
        a = b;
        b = temp;
        }
    }
}
