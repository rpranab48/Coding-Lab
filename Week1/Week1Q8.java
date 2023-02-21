import java.util.*;
public class Week1Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        int i;
        for(i=1;i<n;i++){
            System.out.print(a+" ");
                a = a+i;
            }
    }   
}
