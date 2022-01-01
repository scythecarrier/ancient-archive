import java.util.Scanner;
public class incORdec {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int prev = scan.nextInt();
        int i = 1;
        boolean isdec = true;
        boolean valid = true;
        while(i<=n-1){
            
            int cur = scan.nextInt();
            if(cur == prev){
                isdec = false;
                System.out.println(isdec);
                return;
            }
            else if(cur<prev){
                if(isdec == true){
                    prev = cur;
                }
                else{
                    valid = false;
                }
            }
            else if(cur > prev){
                isdec = false;
                if(isdec == false){
                    prev = cur;
                }
                else{
                    valid = false;
                }
            }
            i++;
        }
        System.out.print(valid);
    }
}