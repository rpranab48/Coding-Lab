import java.util.*;
public class Week2Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a,c=0;
        int  b =n;
        while(n!=0){
            a=n%10;
            c=c*10+a;
            n=n/10;
        }
        //System.out.println(c);
        if(b==c){
            System.out.println(c+" is a palindrome number");
        }else{
            System.out.println(c+" is not a palindrome number");
        }
    }
}
