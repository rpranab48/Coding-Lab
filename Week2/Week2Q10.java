import java.util.*;

public class Week2Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int a = sc.nextInt(), b=65;
        int arr[] = new int[100];
        for(int i=0;i<c;i++){
            arr[i]=a%10;
            a=a/10;
        }
        /*for(int i=0;i<c;i++){
            System.out.println(arr[i]);
        }*/
        for(int i=c-1;i>=0;i--){
            System.out.print((char)b+""+arr[i]+" ");
            b++;
        }

    }
}
