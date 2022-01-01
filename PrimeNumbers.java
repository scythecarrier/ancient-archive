//Using this code, you can print all the prime numbers upto n.
import java.util.Scanner;
public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i = 2; i<=n; i++) {
			boolean prime = true;
			for(int j = 2; j<=i/2; j++) {
				if(i%j==0) {
					prime = false;
					break;
				}
			}
			if(prime==true) {
				System.out.println(i);
			}
		}
	}
}
