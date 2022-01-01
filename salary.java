//Using this code, you can find out the net salary of a person.
import java.util.Scanner;
import java.lang.Math;
public class salary {
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sal = scan.nextInt();
        String grade = scan.next();
        char gra= grade.charAt(0);
        double total = 0;
        double hra = (20.0/100.0)*sal;
        double da = (50.0/100.0)*sal;
        double pf = (11.0/100.0)*sal;
        int allow = 0;
        if(sal > 7500000)
        {
            System.out.print("Enter a valid salary!!");
            return;
        }
        else
        {
            if(gra == 65){
                allow = 1700;
                total = sal + hra + da + allow - pf;
                System.out.print(Math.round(total));
            }
            else if(gra == 66){
                allow = 1500;
                total = sal + hra + da + allow - pf;
                System.out.print(Math.round(total));
            }
            else if(gra >= 67 && gra <= 90){
                allow = 1300;
                total = sal + hra + da + allow - pf;
                System.out.print(Math.round(total));
            }
            else{
                System.out.print("Grade not valid.");
                return;
            }
        }
	}
}
