// Using this code, you can convert Fahrenheit to Celsius.
import java.util.Scanner;
public class FtoC{


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int S = s.nextInt(); //start value
        int E = s.nextInt(); //end value
        int W = s.nextInt(); //step size
        int i, Celsius;
        Celsius = 0;
        
        if((S > -1 && S < 81)&&(E > S-1 && E < 901)&&(W > -1 && W < 41)){
            System.out.println("Constraints: 0 <= S <= 80;S <= E <=  900;0 <= W <= 40");
        }
        else{
            for(i=S; i<=E; i+=W){
                Celsius = ((i-32)*5)/9;
                System.out.println(i+" "+Celsius);
            }
        }
	}

}
