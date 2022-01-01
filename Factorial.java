// Using this code, you can calculate the factorial of a number.
import java.util.Scanner;
public class Factorial {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int N=scan.nextInt();
		int i,fact;
		fact=1;
		for(i=1; i<=N; i++) {
			fact = fact * i;
		}
	System.out.print("Factorial= " + fact);
	}
}
