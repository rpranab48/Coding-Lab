import java.util.*;

import javax.sound.sampled.SourceDataLine;
public class Week2Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        for(int i=1;i<a;i++){
            if(a%i==0)
            sum = sum + i;
        }
            //System.out.println(sum);
            if(sum==a){
                System.out.println(a+" is a Perfect number");
            }else{
                System.out.println(a+" is not a perfect number");
            }
        }
    
}
