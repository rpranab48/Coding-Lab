import java.util.*;
public class Week2Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number = 0,a;
        while(n!=0){
            a = n%10;
            number++;
            n = n/10;
        }
        System.out.println(number);
    }
}
