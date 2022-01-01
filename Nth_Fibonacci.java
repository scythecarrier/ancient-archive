// Using this code, you can find out the nth term of a Fibonacci series.
import java.util.Scanner;
public class Nth_Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n==1){
            System.out.println(n);
        }
        else{
            int a = 1,b = 1;
            int F = 0;
            for(int i = 1; i<=n-2; i++){
                F = a+b;
                a = b;
                b = F;
            }
            System.out.println(F);
        }
    }
}
