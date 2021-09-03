
package CompititivePorgramming;
import static java.lang.Math.ceil;
import static java.lang.Math.floor;
import java.util.*;

public class problem_486A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        //int j = 
        if (n % 2 == 0) {
            
            long result = n / 2;
            System.out.print("even"+result);
        } else {
            long result = (n / 2 + 1)*(-1);
            System.out.print(result);
        }
        
    }
}
