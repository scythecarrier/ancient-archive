import java.util.Scanner;
public class avgMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
				
				/* Your class should be named Solution.
			 	* Read input as specified in the question.
			 	* Print output as specified in the question.
				*/

	}
}