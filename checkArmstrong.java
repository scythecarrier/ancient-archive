import java.util.Scanner;
import java.lang.Math;
public class checkArmstrong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int u = n;
        double h = n;
        double arm = 0;
        int num = 0;
        int count = 1;
        while(n!=0){
            count++;
            n=n/10;
        }
        count = count - 1;
        while(u!=0){
            num = u %10;
            arm = arm + Math.pow(num,count);
            u=u/10;
        }
        if(h==arm){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}