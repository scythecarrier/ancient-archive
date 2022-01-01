// Using this code, you can print a square pattern consisting of odd numbers.
import java.util.Scanner;
public class OddSquare {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 1;
        if(n<=0 || n>50){
            return;
        }
        else{
            int odd = i;
            while(i<n){
                odd = odd + 2;
                i++;
            }
            i = 1;
            while(i<=odd){
                int j = i;
            	while(j<=odd){
                    System.out.print(j);
                    j=j+2;
                }
                int rev = 1;
                while(rev<i){
                    System.out.print(rev);
                    rev=rev+2;
                }
                System.out.println();
                i=i+2;
            }
        }
    }
}
