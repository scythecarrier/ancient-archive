//Using this code, you can print the average score of a student in three subjects alongwith the first character of his/her name.
import java.util.Scanner;
public class avgMarks {

	public static void main(String[] args) {
		            Scanner s = new Scanner(System.in);
		            System.out.println("Enter your name.");
		            String name = s.next();
		            char ch = name.charAt(0);
		            System.out.println("Enter marks of first subject.");
		            int m1 = s.nextInt();
		            System.out.println("Enter marks of second subject.");
		            int m2 = s.nextInt();
		            System.out.println("Enter marks of third subject.");
		            int m3 = s.nextInt();
		            int avg = (m1 + m2 + m3)/3;
		            System.out.println(ch);
		            System.out.print(avg);
	}
}
